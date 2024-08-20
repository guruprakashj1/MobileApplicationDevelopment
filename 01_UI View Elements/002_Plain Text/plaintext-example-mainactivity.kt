package com.example.plaintextexample

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var plainTextInputLayout: TextInputLayout
    private lateinit var plainTextEditText: TextInputEditText
    private lateinit var charCountTextView: TextView
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    private val maxCharCount = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        plainTextInputLayout = findViewById(R.id.plainTextInputLayout)
        plainTextEditText = findViewById(R.id.plainTextEditText)
        charCountTextView = findViewById(R.id.charCountTextView)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up input validation
        setupInputValidation()

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun setupInputValidation() {
        plainTextEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val currentLength = s?.length ?: 0
                charCountTextView.text = "$currentLength / $maxCharCount"

                when {
                    currentLength > maxCharCount -> {
                        plainTextInputLayout.error = "Maximum length exceeded"
                    }
                    currentLength < 3 -> {
                        plainTextInputLayout.error = "Minimum 3 characters required"
                    }
                    else -> {
                        plainTextInputLayout.error = null
                    }
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }

    private fun handleSubmit() {
        val plainText = plainTextEditText.text.toString().trim()

        when {
            plainText.isEmpty() -> {
                plainTextInputLayout.error = "Text cannot be empty"
                resultTextView.text = "Please enter some text"
            }
            plainText.length < 3 -> {
                plainTextInputLayout.error = "Minimum 3 characters required"
                resultTextView.text = "Text is too short"
            }
            plainText.length > maxCharCount -> {
                plainTextInputLayout.error = "Maximum length exceeded"
                resultTextView.text = "Text is too long"
            }
            else -> {
                plainTextInputLayout.error = null
                resultTextView.text = "Submitted Text: $plainText"
            }
        }
    }
}
