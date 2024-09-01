package com.example.filterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchEditText: EditText
    private lateinit var adapter: ItemAdapter

    // Sample data for the list
    private val allItems = listOf(
        "Apple", "Banana", "Cherry", "Date", "Elderberry",
        "Fig", "Grape", "Honeydew", "Imbe", "Jackfruit"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        recyclerView = findViewById(R.id.recyclerView)
        searchEditText = findViewById(R.id.searchEditText)

        // Set up RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ItemAdapter(allItems)
        recyclerView.adapter = adapter

        // Set up search functionality
        searchEditText.addTextChangedListener { text ->
            filterItems(text.toString())
        }
    }

    // Function to filter items based on search query
    private fun filterItems(query: String) {
        val filteredList = if (query.isEmpty()) {
            allItems
        } else {
            allItems.filter { it.contains(query, ignoreCase = true) }
        }
        adapter.updateItems(filteredList)
    }
}