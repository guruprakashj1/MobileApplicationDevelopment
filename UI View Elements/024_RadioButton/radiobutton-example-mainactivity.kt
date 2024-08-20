package com.example.radiobuttonexample

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBasicRadioButton()
        setupCustomTextRadioButton()
        setupCustomColorRadioButton()
        setupDisabledRadioButton()
        setupCustomDrawableRadioButton()
        createProgrammaticRadioButton()
        setupRadioGroup()
    }

    private fun setupBasicRadioButton() {
        val basicRadioButton: RadioButton = findViewById(R.id.basicRadioButton)
        basicRadioButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Basic RadioButton is ${if (isChecked) "checked" else "unchecked"}")
        }
    }

    private fun setupCustomTextRadioButton() {
        val customTextRadioButton: RadioButton = findViewById(R.id.customTextRadioButton)
        customTextRadioButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Text RadioButton is ${if (isChecked) "checked" else "unchecked"}")
        }
    }

    private fun setupCustomColorRadioButton() {
        val customColorRadioButton: RadioButton = findViewById(R.id.customColorRadioButton)
        customColorRadioButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Color RadioButton is ${if (isChecked) "checked" else "unchecked"}")
        }
    }

    private fun setupDisabledRadioButton() {
        val disabledRadioButton: RadioButton = findViewById(R.id.disabledRadioButton)
        disabledRadioButton.isEnabled = false
    }

    private fun setupCustomDrawableRadioButton() {
        val customDrawableRadioButton: RadioButton = findViewById(R.id.customDrawableRadioButton)
        customDrawableRadioButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Drawable RadioButton is ${if (isChecked) "checked" else "unchecked"}")
        }
    }

    private fun createProgrammaticRadioButton() {
        val containerLayout: LinearLayout = findViewById(R.id.radioButtonContainer)
        
        val programmaticRadioButton = RadioButton(this).apply {
            text = "Programmatic RadioButton"
            setTextColor(ContextCompat.getColor(context, android.R.color.holo_blue_dark))
            isChecked = true
        }
        
        programmaticRadioButton.setOnCheckedChangeListener { _, isChecked ->
            showToast("Programmatic RadioButton is ${if (isChecked) "checked" else "unchecked"}")
        }

        containerLayout.addView(programmaticRadioButton)
    }

    private fun setupRadioGroup() {
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton: RadioButton = findViewById(checkedId)
            showToast("Selected: ${radioButton.text}")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
