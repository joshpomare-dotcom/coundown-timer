package com.example.countdownwidget

import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val daysRemainingText = findViewById<TextView>(R.id.daysRemainingText)
        val percentText = findViewById<TextView>(R.id.percentText)

        val daysRemaining = ProgressUtil.getDaysRemaining()
        val percent = ProgressUtil.getProgressPercent()

        progressBar.max = 100
        progressBar.progress = percent

        daysRemainingText.text = if (daysRemaining > 0) {
            "$daysRemaining days remaining"
        } else {
            "Countdown complete!"
        }
        percentText.text = "$percent%"
    }
}
