package com.example.textclockdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the TextClock for Tokyo time
        val tokyoClock: TextClock = findViewById(R.id.tokyoClock)

        // Set the time zone programmatically
        tokyoClock.timeZone = "Asia/Tokyo"
    }
}
