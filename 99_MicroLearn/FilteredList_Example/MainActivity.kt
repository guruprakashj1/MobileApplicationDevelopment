package com.example.filteredlistexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var radioGroup: RadioGroup
    private lateinit var adapter: ItemAdapter

    // List of all items
    private val allItems = listOf(
        Item("Apple", ItemType.FRUIT),
        Item("Banana", ItemType.FRUIT),
        Item("Carrot", ItemType.VEGETABLE),
        Item("Broccoli", ItemType.VEGETABLE),
        Item("Chocolate Cake", ItemType.OTHER),
        Item("Strawberry", ItemType.FRUIT),
        Item("Tomato", ItemType.VEGETABLE),
        Item("Cheesecake", ItemType.OTHER)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize RadioGroup
        radioGroup = findViewById(R.id.radioGroup)

        // Set up adapter with all items initially
        adapter = ItemAdapter(allItems)
        recyclerView.adapter = adapter

        // Set up radio button listener
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioFruit -> filterItems(ItemType.FRUIT)
                R.id.radioVegetable -> filterItems(ItemType.VEGETABLE)
                R.id.radioOther -> filterItems(ItemType.OTHER)
                R.id.radioAll -> adapter.updateItems(allItems)
            }
        }
    }

    // Function to filter items based on type
    private fun filterItems(type: ItemType) {
        val filteredList = allItems.filter { it.type == type }
        adapter.updateItems(filteredList)
    }
}