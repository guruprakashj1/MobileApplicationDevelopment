package com.example.filteredlistexample

// Data class to represent an item
data class Item(val name: String, val type: ItemType)

// Enum to represent item types
enum class ItemType {
    FRUIT, VEGETABLE, OTHER
}