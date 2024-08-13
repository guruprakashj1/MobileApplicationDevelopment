package com.example.textinputlayoutexample

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var nameInputLayout: TextInputLayout
    private lateinit var emailInputLayout: TextInputLayout
    private lateinit var passwordInputLayout: TextInputLayout
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        nameInputLayout = findViewById(R.id.nameInputLayout)
        emailInputLayout = findViewById(R.id.emailInputLayout)
        passwordInputLayout = findViewById(R.id.passwordInputLayout)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up input layouts
        setupInputLayouts()

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun setupInputLayouts() {
        // Set up helper text
        nameInputLayout.helperText = "Enter your full name"
        emailInputLayout.helperText = "Enter a valid email address"
        passwordInputLayout.helperText = "Password must be at least 8 characters long"

        // Enable password toggle
        passwordInputLayout.endIconMode = TextInputLayout.END_ICON_PASSWORD_TOGGLE

        // Set up character counter for password
        passwordInputLayout.counterMaxLength = 20
        passwordInputLayout.isCounterEnabled = true
    }

    private fun handleSubmit() {
        val name = nameInputLayout.editText?.text.toString()
        val email = emailInputLayout.editText?.text.toString()
        val password = passwordInputLayout.editText?.text.toString()

        var isValid = true

        // Validate name
        if (name.isEmpty()) {
            nameInputLayout.error = "Name is required"
            isValid = false
        } else {
            nameInputLayout.error = null
        }

        // Validate email
        if (email.isEmpty()) {
            emailInputLayout.error = "Email is required"
            isValid = false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailInputLayout.error = "Invalid email format"
            isValid = false
        } else {
            emailInputLayout.error = null
        }

        // Validate password
        if (password.isEmpty()) {
            passwordInputLayout.error = "Password is required"
            isValid = false
        } else if (password.length < 8) {
            passwordInputLayout.error = "Password must be at least 8 characters long"
            isValid = false
        } else {
            passwordInputLayout.error = null
        }

        if (isValid) {
            resultTextView.text = "Form submitted successfully!\nName: $name\nEmail: $email"
        } else {
            resultTextView.text = "Please correct the errors in the form"
        }
    }
}
