package com.example.calendarexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var calendarView: CalendarView
    private lateinit var selectedDateTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        calendarView = findViewById(R.id.calendarView)
        selectedDateTextView = findViewById(R.id.selectedDateTextView)

        // Set the initial selected date to today
        val today = Calendar.getInstance().time
        updateSelectedDateText(today)

        // Set up a listener for date changes on the CalendarView
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            // Create a Calendar instance and set it to the selected date
            val selectedDate = Calendar.getInstance()
            selectedDate.set(year, month, dayOfMonth)

            // Update the TextView with the selected date
            updateSelectedDateText(selectedDate.time)
        }
    }

    // Helper function to update the TextView with a formatted date
    private fun updateSelectedDateText(date: Date) {
        val dateFormat = SimpleDateFormat("MMMM d, yyyy", Locale.getDefault())
        val formattedDate = dateFormat.format(date)
        selectedDateTextView.text = getString(R.string.selected_date, formattedDate)
    }
}