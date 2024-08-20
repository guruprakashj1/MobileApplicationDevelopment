# Intent Example

This is a simple Android application that demonstrates the use of Intents in Kotlin. The app consists of two activities:

1. MainActivity: Contains a button that, when clicked, opens the SecondActivity.
2. SecondActivity: Displays a welcome message.

## Project Structure

- `app/src/main/java/com/example/intentexample/`
  - `MainActivity.kt`: The main activity of the application.
  - `SecondActivity.kt`: The second activity launched by the intent.

- `app/src/main/res/layout/`
  - `activity_main.xml`: Layout file for MainActivity.
  - `activity_second.xml`: Layout file for SecondActivity.

- `app/src/main/res/values/`
  - `themes.xml`: Contains the app's theme definition.

- `app/src/main/AndroidManifest.xml`: The app's manifest file.

## How to Run

1. Clone this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Features

- Demonstrates the use of explicit intents to start a new activity.
- Uses ConstraintLayout for responsive UI design.
- Implements a simple theme for consistent styling.

## Requirements

- Android Studio Arctic Fox or later
- Kotlin 1.5 or later
- Android SDK 21 or later

## License

This project is open-source and available under the MIT License.
