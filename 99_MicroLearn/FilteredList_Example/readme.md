# Filtered List Example

This Android app demonstrates a list of items (fruits, vegetables, and other items) with radio buttons to filter the items based on their type.

## Features

- Displays a list of items including fruits, vegetables, and other items (e.g., cakes)
- Radio buttons to filter items by type (All, Fruits, Vegetables, Other)
- Real-time filtering of the list as radio buttons are selected

## Code Structure

- `MainActivity.kt`: Main activity that handles the UI and filtering logic
- `Item.kt`: Data class and enum to represent items and their types
- `ItemAdapter.kt`: RecyclerView adapter for displaying the list of items
- `activity_main.xml`: Main layout file containing the radio buttons and RecyclerView
- `item_layout.xml`: Layout for individual items in the RecyclerView

## How it works

1. The app displays a list of items and radio buttons for filtering.
2. Users can select a radio button to filter the list:
   - "All" shows all items
   - "Fruits" shows only fruit items
   - "Vegetables" shows only vegetable items
   - "Other" shows items that are neither fruits nor vegetables
3. The list updates in real-time as the user selects different filters.

## Implementation Details

- RecyclerView is used to efficiently display the list of items
- RadioGroup and RadioButtons are used for the filtering options
- An enum class (ItemType) is used to categorize items
- The filtering is performed using Kotlin's list filtering capabilities
- The adapter has an updateItems function to refresh the list with filtered results

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

