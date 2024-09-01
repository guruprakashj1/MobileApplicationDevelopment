package com.example.buttonclickexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private var isClicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the button
        button = findViewById(R.id.myButton)

        // Set click listener for the button
        button.setOnClickListener {
            if (isClicked) {
                // If already clicked, revert to original state
                button.text = getString(R.string.click_me)
                button.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_500))
            } else {
                // If not clicked, change text and color
                button.text = getString(R.string.clicked)
                button.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200))
            }
            // Toggle the state
            isClicked = !isClicked
        }
    }
}