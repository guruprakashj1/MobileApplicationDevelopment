package com.example.dateinputexample

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var dateInputLayout: TextInputLayout
    private lateinit var dateEditText: TextInputEditText
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    private val calendar = Calendar.getInstance()
    private val dateFormatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        dateInputLayout = findViewById(R.id.dateInputLayout)
        dateEditText = findViewById(R.id.dateEditText)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up date picker dialog
        dateEditText.setOnClickListener {
            showDatePickerDialog()
        }

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun showDatePickerDialog() {
        val datePickerDialog = DatePickerDialog(
            this,
            { _, year, monthOfYear, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, monthOfYear)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateInView()
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        datePickerDialog.show()
    }

    private fun updateDateInView() {
        dateEditText.setText(dateFormatter.format(calendar.time))
    }

    private fun validateDate(date: String): Boolean {
        return try {
            dateFormatter.parse(date)
            true
        } catch (e: Exception) {
            false
        }
    }

    private fun handleSubmit() {
        val date = dateEditText.text.toString().trim()
        if (date.isEmpty()) {
            dateInputLayout.error = "Date cannot be empty"
            resultTextView.text = "Please select a date"
        } else if (!validateDate(date)) {
            dateInputLayout.error = "Invalid date format"
            resultTextView.text = "Please enter a valid date in DD/MM/YYYY format"
        } else {
            dateInputLayout.error = null
            resultTextView.text = "Selected Date: $date"
            // Here you would typically handle the date (e.g., send to server)
        }
    }
}
