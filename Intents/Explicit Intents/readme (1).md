# Explicit Intent Example

This Android application demonstrates the use of explicit intents in Kotlin to navigate between activities and pass data.

## Project Structure

- `app/src/main/java/com/example/explicitintentexample/`
  - `MainActivity.kt`: The main activity of the application.
  - `SecondActivity.kt`: The second activity launched by the explicit intent.

- `app/src/main/res/layout/`
  - `activity_main.xml`: Layout file for MainActivity.
  - `activity_second.xml`: Layout file for SecondActivity.

- `app/src/main/res/values/`
  - `themes.xml`: Contains the app's theme definition.

- `app/src/main/AndroidManifest.xml`: The app's manifest file.


# MainActivity.kt:

We set the content view to activity_main.xml.
We find the EditText and Button views using findViewById().
We set an OnClickListener for the button.
When the button is clicked, we:
a. Get the text from the EditText.
b. Create an explicit Intent, specifying the current context (this) and the target activity (SecondActivity::class.java).
c. Add the message as an extra to the Intent using putExtra().
d. Start the SecondActivity using startActivity(intent).


# SecondActivity.kt:

We set the content view to activity_second.xml.
We find the TextView using findViewById().
We retrieve the message from the Intent using intent.getStringExtra("MESSAGE_KEY").
If no message is found, we use a default string "No message received".
We set the retrieved message as the text of the TextView.


# activity_main.xml:

Uses ConstraintLayout for a responsive design.
Contains an EditText for message input and a Button to navigate.
The views are constrained to each other and the parent layout for proper positioning.


# activity_second.xml:

Also uses ConstraintLayout.
Contains a TextView to display the received message.
The TextView is centered in the layout.


# themes.xml:

Defines a custom theme that inherits from Material Design.
Sets primary and secondary colors for the app.


# AndroidManifest.xml:

Declares both MainActivity and SecondActivity.
Sets MainActivity as the launcher activity (the entry point of the app).



This example demonstrates how to use an explicit Intent to navigate between activities and pass data. The user enters a message in MainActivity, which is then passed to and displayed in SecondActivity. This pattern is commonly used in Android apps for navigation and data passing between screens.

## Features

- Demonstrates the use of explicit intents to start a new activity.
- Passes data (a message) from MainActivity to SecondActivity.
- Uses ConstraintLayout for responsive UI design.
- Implements a simple Material Design theme.

## How to Run

1. Clone this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Usage

1. Enter a message in the EditText field in MainActivity.
2. Tap the "Navigate to Second Activity" button.
3. The app will navigate to SecondActivity and display the entered message.

## Requirements

- Android Studio Arctic Fox or later
- Kotlin 1.5 or later
- Android SDK 21 or later

## License

This project is open-source and available under the MIT License.
