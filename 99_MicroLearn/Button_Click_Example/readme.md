# Button Click Example

This Android app demonstrates a simple button click interaction using Kotlin.

## Features

- A button that changes its text and color when clicked
- Toggles between two states: "Click me!" and "Clicked!"

## Code Structure

- `MainActivity.kt`: Contains the main logic for handling button clicks
- `activity_main.xml`: Defines the layout of the app's main screen
- `colors.xml`: Defines color resources used in the app
- `strings.xml`: Defines string resources used in the app

## How it works

1. The app displays a button with the text "Click me!" in the center of the screen.
2. When the button is clicked:
   - The text changes to "Clicked!"
   - The button's background color changes from purple to teal
3. Clicking the button again reverts it to its original state.

## Implementation Details

- The app uses a `Boolean` variable `isClicked` to keep track of the button's state.
- `ContextCompat.getColor()` is used to get color resources in a backwards-compatible way.
- String resources are used for button text to facilitate easy localization.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

