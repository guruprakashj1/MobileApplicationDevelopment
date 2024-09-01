# Bottom Navigation Example

This Android app demonstrates the implementation of a bottom navigation menu using the BottomNavigationView from the Material Design library.

## Features

- Bottom navigation menu with three options: Home, Dashboard, and Notifications
- Fragments for each navigation option
- Switching between fragments when navigation items are selected

## Code Structure

- `MainActivity.kt`: Sets up the bottom navigation view and handles fragment transactions
- `HomeFragment.kt`, `DashboardFragment.kt`, `NotificationsFragment.kt`: Fragment classes for each section
- `activity_main.xml`: Main layout file containing the BottomNavigationView and fragment container
- `fragment_home.xml`, `fragment_dashboard.xml`, `fragment_notifications.xml`: Layout files for each fragment
- `menu_bottom_nav.xml`: Defines the structure of the bottom navigation menu

## How it works

1. The app displays a bottom navigation bar with three options.
2. When the app starts, it loads the Home fragment by default.
3. When a user taps on a navigation item, the corresponding fragment is loaded into the fragment container.
4. Each fragment displays a simple text message to indicate which section is active.

## Implementation Details

- BottomNavigationView is used to create the bottom navigation menu.
- Fragments are used to represent different sections of the app.
- The FragmentManager is used to handle fragment transactions.
- A menu resource file (menu_bottom_nav.xml) defines the structure of the bottom navigation menu.
- String resources are used for all text content to facilitate easy localization.

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

