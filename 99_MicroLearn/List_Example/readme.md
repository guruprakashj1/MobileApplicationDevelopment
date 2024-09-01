# List Example

This Android app demonstrates a simple list implementation using RecyclerView in Kotlin.

## Features

- Displays a list of items using RecyclerView
- Shows a toast message when an item is clicked

## Code Structure

- `MainActivity.kt`: Sets up the RecyclerView and handles item click events
- `ListAdapter.kt`: Custom RecyclerView adapter to manage the list items
- `activity_main.xml`: Main layout file containing the RecyclerView
- `item_layout.xml`: Layout for individual list items

## How it works

1. The app creates a list of items (fruits in this example).
2. It sets up a RecyclerView with a LinearLayoutManager.
3. A custom ListAdapter is created to manage the list items.
4. When an item is clicked, a toast message is displayed with the item's name.

## Implementation Details

- RecyclerView is used for efficient scrolling and memory usage.
- The ListAdapter extends RecyclerView.Adapter and uses a ViewHolder pattern.
- Lambda functions are used for click listeners to keep the code concise.
- The adapter is generic and can be easily modified to work with different data types.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

