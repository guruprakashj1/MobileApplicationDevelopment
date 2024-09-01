# Toggle Switch Example

This Android app demonstrates a simple toggle switch implementation and shows a toast message when the switch state changes.

## Features

- Displays a toggle switch in the center of the screen
- Shows a toast message when the switch is turned on or off

## Code Structure

- `MainActivity.kt`: Sets up the toggle switch and handles the state change event
- `activity_main.xml`: Main layout file containing the toggle switch
- `strings.xml`: Contains string resources used in the app

## How it works

1. The app displays a toggle switch (Switch widget) in the center of the screen.
2. When the user toggles the switch:
   - If turned ON, a toast message saying "Switch is ON" appears.
   - If turned OFF, a toast message saying "Switch is OFF" appears.
3. The toast message is displayed for a short duration.

## Implementation Details

- The Switch widget is used for the toggle switch functionality.
- An OnCheckedChangeListener is set on the switch to detect state changes.
- Toast.makeText() is used to create and show toast messages.
- String resources are used for all text content to facilitate easy localization.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

