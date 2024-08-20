package com.example.postaladdressexample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var streetInputLayout: TextInputLayout
    private lateinit var cityInputLayout: TextInputLayout
    private lateinit var stateInputLayout: TextInputLayout
    private lateinit var zipInputLayout: TextInputLayout
    private lateinit var countryInputLayout: TextInputLayout

    private lateinit var streetEditText: TextInputEditText
    private lateinit var cityEditText: TextInputEditText
    private lateinit var stateEditText: TextInputEditText
    private lateinit var zipEditText: TextInputEditText
    private lateinit var countryEditText: TextInputEditText

    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        streetInputLayout = findViewById(R.id.streetInputLayout)
        cityInputLayout = findViewById(R.id.cityInputLayout)
        stateInputLayout = findViewById(R.id.stateInputLayout)
        zipInputLayout = findViewById(R.id.zipInputLayout)
        countryInputLayout = findViewById(R.id.countryInputLayout)

        streetEditText = findViewById(R.id.streetEditText)
        cityEditText = findViewById(R.id.cityEditText)
        stateEditText = findViewById(R.id.stateEditText)
        zipEditText = findViewById(R.id.zipEditText)
        countryEditText = findViewById(R.id.countryEditText)

        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun validateField(
        inputLayout: TextInputLayout,
        editText: TextInputEditText,
        errorMessage: String
    ): Boolean {
        return if (editText.text.toString().trim().isEmpty()) {
            inputLayout.error = errorMessage
            false
        } else {
            inputLayout.error = null
            true
        }
    }

    private fun validateZipCode(zip: String): Boolean {
        // This is a simple validation for US ZIP codes
        // Adjust this regex for other countries or more complex validation
        val zipRegex = "^\\d{5}(-\\d{4})?$".toRegex()
        return zipRegex.matches(zip)
    }

    private fun handleSubmit() {
        var isValid = true

        isValid = validateField(streetInputLayout, streetEditText, "Street is required") && isValid
        isValid = validateField(cityInputLayout, cityEditText, "City is required") && isValid
        isValid = validateField(stateInputLayout, stateEditText, "State is required") && isValid
        isValid = validateField(countryInputLayout, countryEditText, "Country is required") && isValid

        val zip = zipEditText.text.toString().trim()
        if (zip.isEmpty()) {
            zipInputLayout.error = "ZIP code is required"
            isValid = false
        } else if (!validateZipCode(zip)) {
            zipInputLayout.error = "Invalid ZIP code format"
            isValid = false
        } else {
            zipInputLayout.error = null
        }

        if (isValid) {
            val address = """
                ${streetEditText.text}
                ${cityEditText.text}, ${stateEditText.text} ${zipEditText.text}
                ${countryEditText.text}
            """.trimIndent()
            resultTextView.text = "Valid address:\n$address"
            // Here you would typically handle the address (e.g., send to server)
        } else {
            resultTextView.text = "Please correct the errors in the form"
        }
    }
}
