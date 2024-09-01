# Checkbox and Submit Example

This Android app demonstrates a simple checkbox selection and submit button interaction using Kotlin.

## Features

- Three checkboxes for user selection
- A submit button that, when clicked, displays the selected options in a toast message

## Code Structure

- `MainActivity.kt`: Contains the main logic for handling checkbox selections and button clicks
- `activity_main.xml`: Defines the layout of the app's main screen
- `strings.xml`: Defines string resources used in the app

## How it works

1. The app displays three checkboxes and a Submit button.
2. Users can select any combination of checkboxes.
3. When the user clicks the Submit button:
   - The app checks which checkboxes are selected.
   - It creates a list of selected options.
   - A toast message displays the selected options or informs the user if no options were selected.

## Implementation Details

- The app uses `findViewById()` to get references to the UI elements.
- A click listener is set on the submit button to handle user interaction.
- The app uses a `mutableListOf<String>()` to store selected options.
- `Toast.makeText()` is used to display messages to the user.
- String resources are used for UI text to facilitate easy localization.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

