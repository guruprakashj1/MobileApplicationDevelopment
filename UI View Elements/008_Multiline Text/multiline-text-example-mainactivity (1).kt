package com.example.multilineexample

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textInputLayout: TextInputLayout
    private lateinit var multilineEditText: TextInputEditText
    private lateinit var charCountTextView: TextView
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    private val maxCharCount = 500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        textInputLayout = findViewById(R.id.textInputLayout)
        multilineEditText = findViewById(R.id.multilineEditText)
        charCountTextView = findViewById(R.id.charCountTextView)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up character count
        updateCharCount(0)

        // Set up text change listener
        multilineEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val count = s?.length ?: 0
                updateCharCount(count)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun updateCharCount(count: Int) {
        charCountTextView.text = "$count / $maxCharCount"
        if (count > maxCharCount) {
            textInputLayout.error = "Character limit exceeded"
        } else {
            textInputLayout.error = null
        }
    }

    private fun handleSubmit() {
        val text = multilineEditText.text.toString().trim()
        if (text.isEmpty()) {
            textInputLayout.error = "Text cannot be empty"
            resultTextView.text = "Please enter some text"
        } else if (text.length > maxCharCount) {
            textInputLayout.error = "Character limit exceeded"
            resultTextView.text = "Please shorten your text"
        } else {
            textInputLayout.error = null
            resultTextView.text = "Submitted Text:\n\n$text"
            // Here you would typically handle the text (e.g., send to server)
        }
    }
}
