package com.example.countdownwidget

import java.time.LocalDate
import java.time.temporal.ChronoUnit

object ProgressUtil {
    // Change these two lines if you ever want different dates.
    private val START_DATE: LocalDate = LocalDate.of(2026, 6, 18)
    private val END_DATE: LocalDate = LocalDate.of(2026, 9, 16)

    fun getProgress(today: LocalDate = LocalDate.now()): Float {
        if (today.isBefore(START_DATE)) return 0f
        if (!today.isBefore(END_DATE)) return 1f
        val total = ChronoUnit.DAYS.between(START_DATE, END_DATE)
        val elapsed = ChronoUnit.DAYS.between(START_DATE, today)
        return (elapsed.toFloat() / total.toFloat()).coerceIn(0f, 1f)
    }

    fun getProgressPercent(today: LocalDate = LocalDate.now()): Int {
        return (getProgress(today) * 100).toInt()
    }

    fun getDaysRemaining(today: LocalDate = LocalDate.now()): Long {
        val remaining = ChronoUnit.DAYS.between(today, END_DATE)
        return if (remaining < 0) 0 else remaining
    }
}
