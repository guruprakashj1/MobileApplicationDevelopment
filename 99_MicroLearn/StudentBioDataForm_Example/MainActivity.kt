package com.example.studentbiodata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    // Declare UI elements
    private lateinit var nameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var genderRadioGroup: RadioGroup
    private lateinit var majorSpinner: Spinner
    private lateinit var hobbyCheckBox1: CheckBox
    private lateinit var hobbyCheckBox2: CheckBox
    private lateinit var hobbyCheckBox3: CheckBox
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        nameEditText = findViewById(R.id.nameEditText)
        ageEditText = findViewById(R.id.ageEditText)
        genderRadioGroup = findViewById(R.id.genderRadioGroup)
        majorSpinner = findViewById(R.id.majorSpinner)
        hobbyCheckBox1 = findViewById(R.id.hobbyCheckBox1)
        hobbyCheckBox2 = findViewById(R.id.hobbyCheckBox2)
        hobbyCheckBox3 = findViewById(R.id.hobbyCheckBox3)
        submitButton = findViewById(R.id.submitButton)

        // Set up spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.majors_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            majorSpinner.adapter = adapter
        }

        // Set up submit button click listener
        submitButton.setOnClickListener {
            submitForm()
        }
    }

    private fun submitForm() {
        // Get values from UI elements
        val name = nameEditText.text.toString()
        val age = ageEditText.text.toString()
        val gender = when (genderRadioGroup.checkedRadioButtonId) {
            R.id.maleRadioButton -> "Male"
            R.id.femaleRadioButton -> "Female"
            else -> "Not specified"
        }
        val major = majorSpinner.selectedItem.toString()
        val hobbies = mutableListOf<String>()
        if (hobbyCheckBox1.isChecked) hobbies.add(hobbyCheckBox1.text.toString())
        if (hobbyCheckBox2.isChecked) hobbies.add(hobbyCheckBox2.text.toString())
        if (hobbyCheckBox3.isChecked) hobbies.add(hobbyCheckBox3.text.toString())

        // Create intent to start ResultActivity
        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra("NAME", name)
            putExtra("AGE", age)
            putExtra("GENDER", gender)
            putExtra("MAJOR", major)
            putStringArrayListExtra("HOBBIES", ArrayList(hobbies))
        }
        startActivity(intent)
    }
}