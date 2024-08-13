package com.example.passwordexample

import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var passwordEditText: TextInputEditText
    private lateinit var numericPasswordEditText: TextInputEditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        passwordEditText = findViewById(R.id.passwordEditText)
        numericPasswordEditText = findViewById(R.id.numericPasswordEditText)
        resultTextView = findViewById(R.id.resultTextView)
        val submitButton: Button = findViewById(R.id.submitButton)

        // Set up numeric password field
        numericPasswordEditText.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(4))

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun handleSubmit() {
        val password = passwordEditText.text.toString()
        val pin = numericPasswordEditText.text.toString()

        var isValid = true
        var resultMessage = ""

        if (password.isEmpty()) {
            passwordEditText.error = "Please enter a password"
            isValid = false
        } else if (password.length < 8) {
            passwordEditText.error = "Password must be at least 8 characters"
            isValid = false
        }

        if (pin.isEmpty()) {
            numericPasswordEditText.error = "Please enter a PIN"
            isValid = false
        } else if (pin.length != 4) {
            numericPasswordEditText.error = "PIN must be 4 digits"
            isValid = false
        }

        if (isValid) {
            resultMessage = "Password and PIN submitted successfully!"
            // Here you would typically handle the password and PIN (e.g., validate against a database)
            // For security reasons, we're not displaying the actual password or PIN
        }

        resultTextView.text = resultMessage
    }
}
