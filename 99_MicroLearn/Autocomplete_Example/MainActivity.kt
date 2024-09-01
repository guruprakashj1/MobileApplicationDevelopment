package com.example.autocompleteexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var autoCompleteTextView: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize AutoCompleteTextView
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView)

        // Create an array of fruits for suggestions
        val fruits = arrayOf("Apple", "Apricot", "Avocado", "Banana", "Blackberry", "Blueberry", "Cherry", "Coconut", "Date", "Fig", "Grape", "Kiwi", "Lemon", "Lime", "Mango", "Orange", "Papaya", "Peach", "Pear", "Pineapple", "Plum", "Raspberry", "Strawberry", "Watermelon")

        // Create an ArrayAdapter with the fruits array and a default layout for suggestions
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, fruits)

        // Set the adapter to the AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter)

        // Set the minimum number of characters to trigger autocomplete
        autoCompleteTextView.threshold = 1

        // Set an item click listener
        autoCompleteTextView.setOnItemClickListener { parent, _, position, _ ->
            val selectedFruit = parent.getItemAtPosition(position) as String
            Toast.makeText(this, "You selected: $selectedFruit", Toast.LENGTH_SHORT).show()
        }
    }
}