# Countdown Widget

An Android app + home-screen widget that shows a progress bar and "days remaining"
counting from **June 18, 2026** to **September 16, 2026**.

To change the dates, edit `START_DATE` and `END_DATE` in
`app/src/main/java/com/example/countdownwidget/ProgressUtil.kt`.

---

## Option A — Build with GitHub Actions (no software to install)

This is the easiest way to get an .apk file your friend can download, with nothing
installed on your computer.

1. Create a new **public** GitHub repo (private also works but downloading the
   artifact requires being logged in).
2. Upload all the files in this folder to that repo (drag-and-drop on github.com works,
   or `git init && git add . && git commit -m "init" && git push`).
3. Go to the repo's **Actions** tab. The "Build APK" workflow runs automatically on
   push (or click "Run workflow" to trigger it manually).
4. When it finishes (green check, ~2–3 minutes), open the workflow run and download
   the **countdown-widget-debug** artifact — it's a zip containing `app-debug.apk`.
5. Send that `app-debug.apk` file to your friend (email, Drive, WhatsApp, AirDrop, etc.)
   — or just share the GitHub Actions artifact link directly.

## Option B — Build with Android Studio

1. Install [Android Studio](https://developer.android.com/studio) (free).
2. Open this folder as a project (File → Open).
3. Let Gradle sync (first time may take a few minutes — it downloads its own tools).
4. Build → Build App Bundle(s) / APK(s) → Build APK(s).
5. Find the built file at `app/build/outputs/apk/debug/app-debug.apk` and send it
   to your friend the same way as above.

---

## Installing it (for your friend)

Android blocks installing apps from outside the Play Store by default. Your friend
will need to:

1. Open the `app-debug.apk` file they received (tap it in Downloads/Files, or the
   email/chat attachment).
2. Android will prompt to allow installing from that source — tap **Settings** →
   allow it, then go back and tap **Install**.
3. Open the app once from the app drawer (just to launch it).
4. **Add the widget:** long-press an empty spot on the home screen → **Widgets** →
   scroll to **Countdown** → drag it onto the home screen.

The widget refreshes roughly once an hour (Android's normal widget update
behavior) — no need for anything faster since this is a day-level countdown.
