# Round Button Example

This Android app demonstrates a simple round button implementation and shows an alert dialog when the button is clicked.

## Features

- Displays a round button in the center of the screen
- Shows an alert dialog when the button is clicked

## Code Structure

- `MainActivity.kt`: Sets up the round button and handles the click event
- `activity_main.xml`: Main layout file containing the round button
- `round_button.xml`: Drawable resource file defining the round shape of the button
- `colors.xml`: Contains color definitions, including the button color
- `strings.xml`: Contains string resources used in the app

## How it works

1. The app displays a round button in the center of the screen.
2. When the user clicks the button, an alert dialog appears.
3. The alert dialog shows a title, message, and an OK button.
4. Clicking OK dismisses the dialog.

## Implementation Details

- The round shape of the button is defined using a shape drawable (`round_button.xml`).
- The button's appearance is set using the `android:background` attribute in the layout file.
- AlertDialog.Builder is used to create and show the alert dialog.
- String resources are used for all text content to facilitate easy localization.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

