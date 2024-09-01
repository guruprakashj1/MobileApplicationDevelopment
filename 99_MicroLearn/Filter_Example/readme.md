# Filter Example

This Android app demonstrates a simple filter functionality using RecyclerView and EditText in Kotlin. It allows users to search and filter a list of items in real-time.

## Features

- Displays a list of items using RecyclerView
- Provides a search input field to filter the list
- Updates the list in real-time as the user types

## Code Structure

- `MainActivity.kt`: Sets up the RecyclerView and handles the search functionality
- `ItemAdapter.kt`: Custom RecyclerView adapter to manage and filter the list items
- `activity_main.xml`: Main layout file containing the EditText for search and RecyclerView
- `item_layout.xml`: Layout for individual list items

## How it works

1. The app displays a list of items (fruits in this example) in a RecyclerView.
2. An EditText at the top of the screen allows users to enter search queries.
3. As the user types, the list is filtered in real-time to show only items that contain the search query.
4. The filtering is case-insensitive.

## Implementation Details

- RecyclerView is used for efficient scrolling and memory usage.
- The ItemAdapter extends RecyclerView.Adapter and uses a ViewHolder pattern.
- TextWatcher is used to listen for changes in the search input.
- The filter function uses Kotlin's built-in list filtering capabilities.
- The adapter has an updateItems function to refresh the list with filtered results.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

