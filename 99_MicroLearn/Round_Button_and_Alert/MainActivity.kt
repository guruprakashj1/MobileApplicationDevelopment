package com.example.roundbuttonexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private lateinit var roundButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the round button
        roundButton = findViewById(R.id.roundButton)

        // Set click listener for the round button
        roundButton.setOnClickListener {
            showAlertDialog()
        }
    }

    // Function to show the alert dialog
    private fun showAlertDialog() {
        AlertDialog.Builder(this)
            .setTitle(R.string.alert_title)
            .setMessage(R.string.alert_message)
            .setPositiveButton(R.string.ok) { dialog, _ ->
                // Dismiss the dialog when OK is clicked
                dialog.dismiss()
            }
            .show()
    }
}