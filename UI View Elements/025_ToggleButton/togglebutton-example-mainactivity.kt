package com.example.togglebuttonexample

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var controlledTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        controlledTextView = findViewById(R.id.controlledTextView)

        setupBasicToggleButton()
        setupCustomTextToggleButton()
        setupCustomColorToggleButton()
        setupDisabledToggleButton()
        setupCustomBackgroundToggleButton()
        createProgrammaticToggleButton()
        setupCustomOnOffTextToggleButton()
        setupControlToggleButton()
    }

    private fun setupBasicToggleButton() {
        val basicToggleButton: ToggleButton = findViewById(R.id.basicToggleButton)
        basicToggleButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Basic ToggleButton is ${if (isChecked) "ON" else "OFF"}")
        }
    }

    private fun setupCustomTextToggleButton() {
        val customTextToggleButton: ToggleButton = findViewById(R.id.customTextToggleButton)
        customTextToggleButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Text ToggleButton is ${if (isChecked) "ON" else "OFF"}")
        }
    }

    private fun setupCustomColorToggleButton() {
        val customColorToggleButton: ToggleButton = findViewById(R.id.customColorToggleButton)
        customColorToggleButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Color ToggleButton is ${if (isChecked) "ON" else "OFF"}")
        }
    }

    private fun setupDisabledToggleButton() {
        val disabledToggleButton: ToggleButton = findViewById(R.id.disabledToggleButton)
        disabledToggleButton.isEnabled = false
    }

    private fun setupCustomBackgroundToggleButton() {
        val customBackgroundToggleButton: ToggleButton = findViewById(R.id.customBackgroundToggleButton)
        customBackgroundToggleButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Background ToggleButton is ${if (isChecked) "ON" else "OFF"}")
        }
    }

    private fun createProgrammaticToggleButton() {
        val containerLayout: LinearLayout = findViewById(R.id.toggleButtonContainer)
        
        val programmaticToggleButton = ToggleButton(this).apply {
            textOn = "Programmatic ON"
            textOff = "Programmatic OFF"
            isChecked = true
        }
        
        programmaticToggleButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Programmatic ToggleButton is ${if (isChecked) "ON" else "OFF"}")
        }

        containerLayout.addView(programmaticToggleButton)
    }

    private fun setupCustomOnOffTextToggleButton() {
        val customOnOffTextToggleButton: ToggleButton = findViewById(R.id.customOnOffTextToggleButton)
        customOnOffTextToggleButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom On/Off Text ToggleButton is ${if (isChecked) "ENABLED" else "DISABLED"}")
        }
    }

    private fun setupControlToggleButton() {
        val controlToggleButton: ToggleButton = findViewById(R.id.controlToggleButton)
        controlToggleButton.setOnCheckedChangeListener { _, isChecked ->
            controlledTextView.visibility = if (isChecked) View.VISIBLE else View.GONE
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
