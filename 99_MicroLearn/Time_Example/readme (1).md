# Time Example

This Android app demonstrates a simple time selection functionality using TimePickerDialog in Kotlin. It allows users to select a time and displays the selected time in a TextView.

## Features

- Displays a button to open a TimePickerDialog for time selection
- Shows the selected time in a TextView below the button
- Initially displays the current time

## Code Structure

- `MainActivity.kt`: Sets up the TimePickerDialog and handles time selection
- `activity_main.xml`: Main layout file containing the Button and TextView
- `strings.xml`: Contains string resources used in the app

## How it works

1. The app displays a "Select Time" button and a TextView.
2. On app launch, it sets the initial time to the current time.
3. When a user clicks the "Select Time" button, a TimePickerDialog opens.
4. After selecting a time and clicking OK, the TextView updates to show the selected time.
5. The selected time is formatted as "hh:mm AM/PM" (e.g., "03:30 PM").

## Implementation Details

- TimePickerDialog is used for time selection.
- A custom OnTimeSetListener is set up to handle time selection events.
- SimpleDateFormat is used to format the selected time.
- The app uses string resources with placeholders for easy localization.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

