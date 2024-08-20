package com.example.textclockdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock
import java.util.TimeZone

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the TextClock for New York time
        val newYorkClock: TextClock = findViewById(R.id.newYorkClock)

        // Set the time zone programmatically
        newYorkClock.timeZone = TimeZone.getTimeZone("America/New_York").id

        // Find the custom format TextClock
        val customFormatClock: TextClock = findViewById(R.id.customFormatClock)

        // Set a custom time format programmatically
        customFormatClock.format12Hour = "EEEE, MMMM d, yyyy - h:mm:ss a"
        customFormatClock.format24Hour = "EEEE, MMMM d, yyyy - HH:mm:ss"
    }
}
