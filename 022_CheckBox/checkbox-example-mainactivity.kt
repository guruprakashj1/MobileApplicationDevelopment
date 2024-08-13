package com.example.checkboxexample

import android.os.Bundle
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBasicCheckBox()
        setupCustomTextCheckBox()
        setupCustomColorCheckBox()
        setupDisabledCheckBox()
        setupCustomDrawableCheckBox()
        createProgrammaticCheckBox()
        setupCheckBoxGroup()
    }

    private fun setupBasicCheckBox() {
        val basicCheckBox: CheckBox = findViewById(R.id.basicCheckBox)
        basicCheckBox.setOnCheckedChangeListener { _, isChecked ->
            showToast("Basic CheckBox is ${if (isChecked) "checked" else "unchecked"}")
        }
    }

    private fun setupCustomTextCheckBox() {
        val customTextCheckBox: CheckBox = findViewById(R.id.customTextCheckBox)
        customTextCheckBox.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Text CheckBox is ${if (isChecked) "checked" else "unchecked"}")
        }
    }

    private fun setupCustomColorCheckBox() {
        val customColorCheckBox: CheckBox = findViewById(R.id.customColorCheckBox)
        customColorCheckBox.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Color CheckBox is ${if (isChecked) "checked" else "unchecked"}")
        }
    }

    private fun setupDisabledCheckBox() {
        val disabledCheckBox: CheckBox = findViewById(R.id.disabledCheckBox)
        disabledCheckBox.isEnabled = false
    }

    private fun setupCustomDrawableCheckBox() {
        val customDrawableCheckBox: CheckBox = findViewById(R.id.customDrawableCheckBox)
        customDrawableCheckBox.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Drawable CheckBox is ${if (isChecked) "checked" else "unchecked"}")
        }
    }

    private fun createProgrammaticCheckBox() {
        val containerLayout: LinearLayout = findViewById(R.id.checkBoxContainer)
        
        val programmaticCheckBox = CheckBox(this).apply {
            text = "Programmatic CheckBox"
            setTextColor(ContextCompat.getColor(context, android.R.color.holo_blue_dark))
            isChecked = true
        }
        
        programmaticCheckBox.setOnCheckedChangeListener { _, isChecked ->
            showToast("Programmatic CheckBox is ${if (isChecked) "checked" else "unchecked"}")
        }

        containerLayout.addView(programmaticCheckBox)
    }

    private fun setupCheckBoxGroup() {
        val option1: CheckBox = findViewById(R.id.option1CheckBox)
        val option2: CheckBox = findViewById(R.id.option2CheckBox)
        val option3: CheckBox = findViewById(R.id.option3CheckBox)

        val checkBoxes = listOf(option1, option2, option3)

        checkBoxes.forEach { checkBox ->
            checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
                val selectedOptions = checkBoxes.filter { it.isChecked }
                    .map { it.text }
                    .joinToString(", ")
                showToast("Selected options: $selectedOptions")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
