package com.example.timeinputexample

import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var timeInputLayout: TextInputLayout
    private lateinit var timeEditText: TextInputEditText
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        timeInputLayout = findViewById(R.id.timeInputLayout)
        timeEditText = findViewById(R.id.timeEditText)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up time picker dialog
        timeEditText.setOnClickListener {
            showTimePickerDialog()
        }

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun showTimePickerDialog() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            { _, selectedHour, selectedMinute ->
                val time = String.format("%02d:%02d", selectedHour, selectedMinute)
                timeEditText.setText(time)
            },
            hour,
            minute,
            true // 24-hour format
        )

        timePickerDialog.show()
    }

    private fun validateTime(time: String): Boolean {
        val regex = Regex("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")
        return regex.matches(time)
    }

    private fun handleSubmit() {
        val time = timeEditText.text.toString().trim()
        if (time.isEmpty()) {
            timeInputLayout.error = "Time cannot be empty"
            resultTextView.text = "Please enter a time"
        } else if (!validateTime(time)) {
            timeInputLayout.error = "Invalid time format"
            resultTextView.text = "Please enter a valid time in HH:MM format"
        } else {
            timeInputLayout.error = null
            resultTextView.text = "Selected Time: $time"
            // Here you would typically handle the time (e.g., send to server)
        }
    }
}
