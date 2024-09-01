# Text and Submit Example

This Android app demonstrates a simple text input and submit button interaction using Kotlin.

## Features

- An EditText for user input
- A submit button that, when clicked, displays the entered text in a toast message

## Code Structure

- `MainActivity.kt`: Contains the main logic for handling user input and button clicks
- `activity_main.xml`: Defines the layout of the app's main screen
- `strings.xml`: Defines string resources used in the app

## How it works

1. The app displays an EditText field for user input and a Submit button.
2. When the user enters text and clicks the Submit button:
   - If the text is not empty, a toast message displays the entered text.
   - If the text is empty, a toast message asks the user to enter some text.

## Implementation Details

- The app uses `findViewById()` to get references to the UI elements.
- A click listener is set on the submit button to handle user interaction.
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

