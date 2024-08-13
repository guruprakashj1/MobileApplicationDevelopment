package com.example.buttonexample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var standardButton: Button
    private lateinit var materialButton: MaterialButton
    private lateinit var outlinedButton: MaterialButton
    private lateinit var textButton: MaterialButton
    private lateinit var iconButton: MaterialButton
    private lateinit var toggleButton: MaterialButton
    private lateinit var customStyledButton: Button
    private lateinit var disabledButton: Button
    private lateinit var longClickButton: Button
    private lateinit var floatingActionButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeButtons()
        setupClickListeners()
    }

    private fun initializeButtons() {
        standardButton = findViewById(R.id.standardButton)
        materialButton = findViewById(R.id.materialButton)
        outlinedButton = findViewById(R.id.outlinedButton)
        textButton = findViewById(R.id.textButton)
        iconButton = findViewById(R.id.iconButton)
        toggleButton = findViewById(R.id.toggleButton)
        customStyledButton = findViewById(R.id.customStyledButton)
        disabledButton = findViewById(R.id.disabledButton)
        longClickButton = findViewById(R.id.longClickButton)
        floatingActionButton = findViewById(R.id.floatingActionButton)
    }

    private fun setupClickListeners() {
        standardButton.setOnClickListener {
            showToast("Standard Button Clicked")
        }

        materialButton.setOnClickListener {
            showToast("Material Button Clicked")
        }

        outlinedButton.setOnClickListener {
            showToast("Outlined Button Clicked")
        }

        textButton.setOnClickListener {
            showToast("Text Button Clicked")
        }

        iconButton.setOnClickListener {
            showToast("Icon Button Clicked")
        }

        toggleButton.setOnClickListener {
            toggleButton.isChecked = !toggleButton.isChecked
            showToast("Toggle Button: ${if (toggleButton.isChecked) "ON" else "OFF"}")
        }

        customStyledButton.setOnClickListener {
            showToast("Custom Styled Button Clicked")
        }

        longClickButton.setOnLongClickListener {
            showToast("Long Click Detected")
            true
        }

        floatingActionButton.setOnClickListener {
            showToast("Floating Action Button Clicked")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
