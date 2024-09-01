package com.example.timeexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.app.TimePickerDialog
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var selectTimeButton: Button
    private lateinit var selectedTimeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        selectTimeButton = findViewById(R.id.selectTimeButton)
        selectedTimeTextView = findViewById(R.id.selectedTimeTextView)

        // Set the initial time to the current time
        updateTimeDisplay(Calendar.getInstance())

        // Set up click listener for the select time button
        selectTimeButton.setOnClickListener {
            showTimePickerDialog()
        }
    }

    // Function to show the TimePickerDialog
    private fun showTimePickerDialog() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            { _, selectedHour, selectedMinute ->
                val selectedTime = Calendar.getInstance()
                selectedTime.set(Calendar.HOUR_OF_DAY, selectedHour)
                selectedTime.set(Calendar.MINUTE, selectedMinute)
                updateTimeDisplay(selectedTime)
            },
            hour,
            minute,
            false // Set to true for 24-hour format
        )

        timePickerDialog.show()
    }

    // Function to update the TextView with the selected time
    private fun updateTimeDisplay(calendar: Calendar) {
        val dateFormat = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedTime = dateFormat.format(calendar.time)
        selectedTimeTextView.text = getString(R.string.selected_time, formattedTime)
    }
}