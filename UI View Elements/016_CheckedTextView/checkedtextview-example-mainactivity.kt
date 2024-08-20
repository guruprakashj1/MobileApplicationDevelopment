package com.example.checkedtextviewexample

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var adapter: CustomAdapter
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        listView = findViewById(R.id.listView)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up ListView with custom adapter
        setupListView()

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun setupListView() {
        val items = resources.getStringArray(R.array.items_array).toList()
        adapter = CustomAdapter(this, items)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            adapter.toggleItemChecked(position)
        }
    }

    private fun handleSubmit() {
        val selectedItems = adapter.getCheckedItems()
        if (selectedItems.isNotEmpty()) {
            val formattedItems = selectedItems.joinToString(", ")
            resultTextView.text = "Selected items: $formattedItems"
        } else {
            resultTextView.text = "No items selected"
        }
    }
}
