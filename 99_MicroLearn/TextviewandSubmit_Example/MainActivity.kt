package com.example.textandsubmit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Declare UI elements
    private lateinit var editText: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        editText = findViewById(R.id.editText)
        submitButton = findViewById(R.id.submitButton)

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            // Get the text from the EditText
            val enteredText = editText.text.toString()

            // Check if the entered text is not empty
            if (enteredText.isNotEmpty()) {
                // Display a toast with the entered text
                Toast.makeText(this, "You entered: $enteredText", Toast.LENGTH_SHORT).show()
            } else {
                // Display a toast asking the user to enter text
                Toast.makeText(this, "Please enter some text", Toast.LENGTH_SHORT).show()
            }
        }
    }
}