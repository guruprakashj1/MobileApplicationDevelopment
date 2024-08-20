package com.example.buttonexample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var standardButton: Button
    private lateinit var customBackgroundButton: Button
    private lateinit var customTextButton: Button
    private lateinit var disabledButton: Button
    private lateinit var longClickButton: Button
    private lateinit var styledButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeButtons()
        setupClickListeners()
    }

    private fun initializeButtons() {
        standardButton = findViewById(R.id.standardButton)
        customBackgroundButton = findViewById(R.id.customBackgroundButton)
        customTextButton = findViewById(R.id.customTextButton)
        disabledButton = findViewById(R.id.disabledButton)
        longClickButton = findViewById(R.id.longClickButton)
        styledButton = findViewById(R.id.styledButton)
    }

    private fun setupClickListeners() {
        standardButton.setOnClickListener {
            showToast("Standard Button Clicked")
        }

        customBackgroundButton.setOnClickListener {
            showToast("Custom Background Button Clicked")
        }

        customTextButton.setOnClickListener {
            showToast("Custom Text Button Clicked")
        }

        longClickButton.setOnLongClickListener {
            showToast("Long Click Detected")
            true
        }

        styledButton.setOnClickListener {
            showToast("Styled Button Clicked")
        }

        // Programmatically change button properties
        customTextButton.setOnClickListener {
            it.isEnabled = false
            (it as Button).text = "Button Disabled"
            showToast("Custom Text Button Disabled")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
