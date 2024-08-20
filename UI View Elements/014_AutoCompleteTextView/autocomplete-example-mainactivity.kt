package com.example.autocompleteexample

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var countryAutoComplete: AutoCompleteTextView
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        countryAutoComplete = findViewById(R.id.countryAutoComplete)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up AutoCompleteTextView
        setupAutoComplete()

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun setupAutoComplete() {
        val countries = resources.getStringArray(R.array.countries_array)
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countries)
        countryAutoComplete.setAdapter(adapter)

        // Optional: Set threshold for when suggestions should appear (default is 1)
        countryAutoComplete.threshold = 1

        // Optional: Handle item selection
        countryAutoComplete.setOnItemClickListener { parent, _, position, _ ->
            val selectedCountry = parent.getItemAtPosition(position) as String
            countryAutoComplete.setText(selectedCountry)
        }
    }

    private fun handleSubmit() {
        val selectedCountry = countryAutoComplete.text.toString()
        if (selectedCountry.isNotEmpty()) {
            resultTextView.text = "Selected Country: $selectedCountry"
        } else {
            resultTextView.text = "Please select a country"
        }
    }
}
