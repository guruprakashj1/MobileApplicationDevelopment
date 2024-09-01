# Autocomplete Example

This Android app demonstrates a simple autocomplete functionality using AutoCompleteTextView in Kotlin.

## Features

- Displays an AutoCompleteTextView for entering fruit names
- Provides autocomplete suggestions as the user types
- Shows a toast message when a suggestion is selected

## Code Structure

- `MainActivity.kt`: Sets up the AutoCompleteTextView and handles item selection
- `activity_main.xml`: Main layout file containing the AutoCompleteTextView
- `strings.xml`: Contains string resources used in the app

## How it works

1. The app creates an array of fruit names for suggestions.
2. It sets up an AutoCompleteTextView with an ArrayAdapter containing the fruit names.
3. As the user types, the AutoCompleteTextView suggests matching fruit names.
4. When a suggestion is selected, a toast message is displayed with the selected fruit name.

## Implementation Details

- AutoCompleteTextView is used for efficient text input with suggestions.
- ArrayAdapter is used to provide suggestions to the AutoCompleteTextView.
- The minimum number of characters to trigger autocomplete is set to 1.
- An item click listener is set up to handle suggestion selection.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

