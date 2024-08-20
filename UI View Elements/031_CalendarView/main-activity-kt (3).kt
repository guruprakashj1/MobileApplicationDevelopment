package com.example.calendarviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var calendarView: CalendarView
    private lateinit var dateTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the CalendarView and TextView in the layout
        calendarView = findViewById(R.id.calendarView)
        dateTextView = findViewById(R.id.dateTextView)

        // Set up the initial date display
        updateDateDisplay(calendarView.date)

        // Set up a listener for date changes
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val calendar = Calendar.getInstance()
            calendar.set(year, month, dayOfMonth)
            updateDateDisplay(calendar.timeInMillis)
        }
    }

    private fun updateDateDisplay(dateInMillis: Long) {
        val dateFormat = SimpleDateFormat("MMMM d, yyyy", Locale.getDefault())
        val selectedDate = dateFormat.format(Date(dateInMillis))
        dateTextView.text = "Selected Date: $selectedDate"
    }
}
