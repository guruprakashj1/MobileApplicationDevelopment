# Calendar Example

This Android app demonstrates a simple calendar functionality using CalendarView in Kotlin. It allows users to select a date and displays the selected date in a TextView.

## Features

- Displays a CalendarView for date selection
- Shows the selected date in a TextView below the calendar
- Initially displays today's date

## Code Structure

- `MainActivity.kt`: Sets up the CalendarView and handles date selection
- `activity_main.xml`: Main layout file containing the CalendarView and TextView
- `strings.xml`: Contains string resources used in the app

## How it works

1. The app displays a CalendarView and a TextView.
2. On app launch, it sets the initial selected date to today's date.
3. When a user selects a date on the CalendarView, the TextView updates to show the selected date.
4. The selected date is formatted as "Month Day, Year" (e.g., "April 15, 2023").

## Implementation Details

- CalendarView is used for date selection.
- A custom OnDateChangeListener is set up to handle date selection events.
- SimpleDateFormat is used to format the selected date.
- The app uses string resources with placeholders for easy localization.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

