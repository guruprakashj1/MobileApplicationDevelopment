package com.example.phoneexample

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var phoneInputLayout: TextInputLayout
    private lateinit var phoneEditText: TextInputEditText
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        phoneInputLayout = findViewById(R.id.phoneInputLayout)
        phoneEditText = findViewById(R.id.phoneEditText)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up phone number formatting
        phoneEditText.addTextChangedListener(object : TextWatcher {
            var isFormatting = false
            var deletingHyphen = false
            var hyphenStart = 0
            var cursorComplement = 0

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                deletingHyphen = count == 1 && after == 0 && s[start] == '-'
                hyphenStart = start
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable) {
                if (isFormatting) {
                    return
                }

                isFormatting = true
                val cursorPosition = phoneEditText.selectionStart
                val withoutHyphens = s.toString().replace("-", "")
                var formatted = ""

                for (i in withoutHyphens.indices) {
                    if (i > 0 && (i == 3 || i == 6)) {
                        formatted += "-"
                    }
                    formatted += withoutHyphens[i]
                }

                phoneEditText.setText(formatted)

                var cursorPositionNew = cursorPosition + cursorComplement
                if (cursorPosition <= 3) {
                    cursorPositionNew--
                } else if (cursorPosition <= 7) {
                    cursorPositionNew -= 2
                } else {
                    cursorPositionNew -= 3
                }
                if (deletingHyphen) {
                    cursorPositionNew++
                }

                phoneEditText.setSelection(cursorPositionNew.coerceIn(0, formatted.length))
                isFormatting = false
            }
        })

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun validatePhoneNumber(phoneNumber: String): Boolean {
        val phoneRegex = "^\\d{3}-\\d{3}-\\d{4}$".toRegex()
        return phoneRegex.matches(phoneNumber)
    }

    private fun handleSubmit() {
        val phoneNumber = phoneEditText.text.toString()
        if (validatePhoneNumber(phoneNumber)) {
            resultTextView.text = "Valid phone number: $phoneNumber"
            // Here you would typically handle the phone number (e.g., send to server)
        } else {
            resultTextView.text = "Please enter a valid phone number"
            phoneInputLayout.error = "Invalid phone number format"
        }
    }
}
