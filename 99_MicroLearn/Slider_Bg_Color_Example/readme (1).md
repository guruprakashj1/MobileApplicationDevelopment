# Spinner and Top Navigation Example

This Android app demonstrates the use of a Spinner (dropdown) with its selected value displayed in a TextView, along with a top navigation menu.

## Features

- Spinner (dropdown) with a list of planets
- Display of the selected planet in a TextView
- Top navigation menu with "Settings" and "About" options

## Code Structure

- `MainActivity.kt`: Sets up the spinner, handles item selection, and manages the top navigation menu
- `activity_main.xml`: Main layout file containing the toolbar, spinner, and TextView
- `menu_top_nav.xml`: Defines the structure of the top navigation menu
- `strings.xml`: Contains string resources used in the app, including the array of planets

## How it works

1. The app displays a toolbar at the top with a menu.
2. Below the toolbar, there's a spinner (dropdown) containing a list of planets.
3. When a planet is selected from the spinner, its name is displayed in a TextView below.
4. The top navigation menu has "Settings" and "About" options, which show a toast message when selected.

## Implementation Details

- The Spinner is populated using an ArrayAdapter with data from a string array resource.
- An OnItemSelectedListener is used to handle selection events from the Spinner.
- The Toolbar is set as the app's action bar.
- The options menu is inflated from a menu resource file.
- onOptionsItemSelected() is overridden to handle menu item selections.
- String resources are used for all text content to facilitate easy localization.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

