package com.example.radiogroupexample

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBasicRadioGroup()
        setupHorizontalRadioGroup()
        setupCustomStyledRadioGroup()
        createProgrammaticRadioGroup()
        setupImageRadioGroup()
    }

    private fun setupBasicRadioGroup() {
        val basicRadioGroup: RadioGroup = findViewById(R.id.basicRadioGroup)
        basicRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton: RadioButton = findViewById(checkedId)
            showToast("Selected: ${radioButton.text}")
        }
    }

    private fun setupHorizontalRadioGroup() {
        val horizontalRadioGroup: RadioGroup = findViewById(R.id.horizontalRadioGroup)
        horizontalRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton: RadioButton = findViewById(checkedId)
            showToast("Selected: ${radioButton.text}")
        }
    }

    private fun setupCustomStyledRadioGroup() {
        val customStyledRadioGroup: RadioGroup = findViewById(R.id.customStyledRadioGroup)
        customStyledRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton: RadioButton = findViewById(checkedId)
            showToast("Selected: ${radioButton.text}")
        }
    }

    private fun createProgrammaticRadioGroup() {
        val containerLayout: LinearLayout = findViewById(R.id.radioGroupContainer)
        
        val programmaticRadioGroup = RadioGroup(this).apply {
            orientation = RadioGroup.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        val options = listOf("Option A", "Option B", "Option C")
        options.forEachIndexed { index, option ->
            val radioButton = RadioButton(this).apply {
                id = View.generateViewId()
                text = option
                setTextColor(ContextCompat.getColor(context, android.R.color.holo_blue_dark))
            }
            programmaticRadioGroup.addView(radioButton)
        }

        programmaticRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton: RadioButton = findViewById(checkedId)
            showToast("Programmatic RadioGroup - Selected: ${radioButton.text}")
        }

        containerLayout.addView(programmaticRadioGroup)
    }

    private fun setupImageRadioGroup() {
        val imageRadioGroup: RadioGroup = findViewById(R.id.imageRadioGroup)
        imageRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton: RadioButton = findViewById(checkedId)
            showToast("Selected image: ${radioButton.contentDescription}")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
