# Radio Button and Submit Example

This Android app demonstrates a simple radio button selection and submit button interaction using Kotlin.

## Features

- Three radio buttons for user selection (only one can be selected at a time)
- A submit button that, when clicked, displays the selected option in a toast message

## Code Structure

- `MainActivity.kt`: Contains the main logic for handling radio button selections and button clicks
- `activity_main.xml`: Defines the layout of the app's main screen
- `strings.xml`: Defines string resources used in the app

## How it works

1. The app displays three radio buttons within a RadioGroup and a Submit button.
2. Users can select one radio button at a time.
3. When the user clicks the Submit button:
   - The app checks which radio button is selected.
   - If a radio button is selected, it displays a toast message with the selected option.
   - If no radio button is selected, it prompts the user to select an option.

## Implementation Details

- The app uses `findViewById()` to get references to the UI elements.
- A click listener is set on the submit button to handle user interaction.
- `RadioGroup.checkedRadioButtonId` is used to get the ID of the selected radio button.
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

