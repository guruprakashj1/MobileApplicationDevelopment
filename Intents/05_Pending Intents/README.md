# PendingIntent Example

This Android application demonstrates the use of PendingIntents in Kotlin to create notifications that can open different activities when clicked or when an action button is pressed.

## Project Structure

- `app/src/main/java/com/example/pendingintentexample/`
  - `MainActivity.kt`: The main activity of the application.
  - `DetailActivity.kt`: The activity opened when the notification is clicked.
  - `ActionActivity.kt`: The activity opened when the notification action button is clicked.

- `app/src/main/res/layout/`
  - `activity_main.xml`: Layout file for MainActivity.
  - `activity_detail.xml`: Layout file for DetailActivity.
  - `activity_action.xml`: Layout file for ActionActivity.

- `app/src/main/res/values/`
  - `themes.xml`: Contains the app's theme definition.

- `app/src/main/AndroidManifest.xml`: The app's manifest file.

# MainActivity.kt:

We create a notification channel (required for Android 8.0 and above).
We set up a button that, when clicked, shows a notification.
In the showNotification() function:
a. We create two PendingIntents:

One for the main notification click (opens DetailActivity)
One for the action button (opens ActionActivity)
b. We build the notification using NotificationCompat.Builder, setting the content, icon, and adding the PendingIntents.
c. We show the notification using NotificationManager.




# DetailActivity.kt and ActionActivity.kt:

These are simple activities that display a message to show they've been opened.


Layout files:

activity_main.xml: Contains a button to show the notification.
activity_detail.xml and activity_action.xml: Contain a TextView to display a message.


# AndroidManifest.xml:

We declare all three activities.
MainActivity is set as the launcher activity.


# themes.xml:

Defines a custom theme based on Material Design.



Key Concepts:

PendingIntent:

A PendingIntent is a description of an Intent and a target action to perform with it.
It allows you to pass the Intent to another app (in this case, the notification system), which can perform the Intent's action on your app's behalf.


Notification Channel:

Required for Android 8.0 (API level 26) and above.
Allows users to manage notifications from your app.


NotificationCompat.Builder:

Used to create notifications in a backwards-compatible way.


FLAG_IMMUTABLE:

Used when creating PendingIntents for security reasons, especially important in newer Android versions.



This example demonstrates how to use PendingIntents with notifications to open different activities. When the user taps the notification, it opens the DetailActivity. When the user taps the action button in the notification, it opens the ActionActivity. This showcases how PendingIntents can be used to define actions that will be performed in the future, when the user interacts with the notification.

## Features

- Create and show a notification with a PendingIntent.
- Open a specific activity when the notification is clicked.
- Add an action button to the notification that opens a different activity.

## How to Run

1. Clone this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Usage

1. Tap the "Show Notification" button in the MainActivity.
2. A notification will appear. Tap the notification to open the DetailActivity.
3. Tap the action button in the notification to open the ActionActivity.

## Requirements

- Android Studio Arctic Fox or later
- Kotlin 1.5 or later
- Android SDK 21 or later

## License

This project is open-source and available under the MIT License.
