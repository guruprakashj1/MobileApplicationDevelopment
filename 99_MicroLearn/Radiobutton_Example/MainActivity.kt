package com.example.radiobuttonandsubmit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Declare UI elements
    private lateinit var radioGroup: RadioGroup
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        radioGroup = findViewById(R.id.radioGroup)
        submitButton = findViewById(R.id.submitButton)

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            // Get the ID of the selected radio button
            val selectedId = radioGroup.checkedRadioButtonId

            if (selectedId != -1) {
                // Find the radio button by returned id
                val selectedRadioButton: RadioButton = findViewById(selectedId)

                // Create a message with the selected option
                val message = "You selected: ${selectedRadioButton.text}"

                // Display the message in a toast
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            } else {
                // If no option is selected, show a message to the user
                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
            }
        }
    }
}