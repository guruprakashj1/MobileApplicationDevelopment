package com.example.imagebuttonexample

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var standardImageButton: ImageButton
    private lateinit var customBackgroundImageButton: ImageButton
    private lateinit var selectorImageButton: ImageButton
    private lateinit var paddingImageButton: ImageButton
    private lateinit var longClickImageButton: ImageButton
    private lateinit var styledImageButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeImageButtons()
        setupClickListeners()
    }

    private fun initializeImageButtons() {
        standardImageButton = findViewById(R.id.standardImageButton)
        customBackgroundImageButton = findViewById(R.id.customBackgroundImageButton)
        selectorImageButton = findViewById(R.id.selectorImageButton)
        paddingImageButton = findViewById(R.id.paddingImageButton)
        longClickImageButton = findViewById(R.id.longClickImageButton)
        styledImageButton = findViewById(R.id.styledImageButton)
    }

    private fun setupClickListeners() {
        standardImageButton.setOnClickListener {
            showToast("Standard ImageButton Clicked")
        }

        customBackgroundImageButton.setOnClickListener {
            showToast("Custom Background ImageButton Clicked")
        }

        selectorImageButton.setOnClickListener {
            showToast("Selector ImageButton Clicked")
        }

        paddingImageButton.setOnClickListener {
            showToast("Padding ImageButton Clicked")
        }

        longClickImageButton.setOnLongClickListener {
            showToast("Long Click Detected")
            true
        }

        styledImageButton.setOnClickListener {
            showToast("Styled ImageButton Clicked")
        }

        // Programmatically change ImageButton properties
        paddingImageButton.setOnClickListener {
            it.isEnabled = !it.isEnabled
            showToast(if (it.isEnabled) "ImageButton Enabled" else "ImageButton Disabled")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
