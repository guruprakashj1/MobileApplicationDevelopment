# Internal Intent Example

This Android application demonstrates the use of internal intents in Kotlin to navigate between activities within the same app and pass data between them.

## Project Structure

- `app/src/main/java/com/example/internalintentexample/`
  - `MainActivity.kt`: The main activity of the application.
  - `ProfileActivity.kt`: The profile activity that displays user information.

- `app/src/main/res/layout/`
  - `activity_main.xml`: Layout file for MainActivity.
  - `activity_profile.xml`: Layout file for ProfileActivity.

- `app/src/main/res/values/`
  - `themes.xml`: Contains the app's theme definition.

- `app/src/main/AndroidManifest.xml`: The app's manifest file.

# MainActivity.kt:

We set up two EditText views for name and age input, and a Button to submit the data.
In the button's click listener, we:
a. Get the name and age from the EditText views.
b. Create an Intent for ProfileActivity.
c. Add the name and age as extras to the Intent using putExtra().
d. Start the ProfileActivity using startActivity(intent).


# ProfileActivity.kt:

We set up a TextView to display the profile information and a Button to go back.
In onCreate(), we:
a. Retrieve the name and age from the Intent using getStringExtra() and getIntExtra().
b. Set the TextView's text to display the profile information.
We set up a click listener for the back button that calls finish() to close the activity.


# activity_main.xml:

We use ConstraintLayout for a responsive design.
We have two EditText views for name and age input, and a Button to submit.


# activity_profile.xml:

We use ConstraintLayout for a responsive design.
We have a TextView to display the profile information and a Button to go back.


# themes.xml:

We define a custom theme that inherits from Material Design.
We set primary and secondary colors for the app.


# AndroidManifest.xml:

We declare both MainActivity and ProfileActivity.
We set MainActivity as the launcher activity (the entry point of the app).



This example demonstrates how to use internal intents to navigate between activities within the same app:

We create an explicit intent in MainActivity to start ProfileActivity.
We pass data (name and age) from MainActivity to ProfileActivity using intent extras.
In ProfileActivity, we retrieve the data from the intent and display it.
We use the finish() method to navigate back to MainActivity.

Internal intents are used for communication between components of the same app. They provide a way to navigate between activities and pass data within your application. This is different from external intents, which are used to interact with components of other applications.


## Features

- Input user name and age in MainActivity.
- Navigate to ProfileActivity using an internal intent.
- Pass user data from MainActivity to ProfileActivity.
- Display user information in ProfileActivity.
- Navigate back to MainActivity.

## How to Run

1. Clone this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Usage

1. Enter your name and age in the MainActivity.
2. Tap the "Submit" button to navigate to the ProfileActivity.
3. View your profile information in the ProfileActivity.
4. Tap the "Back" button to return to the MainActivity.

## Requirements

- Android Studio Arctic Fox or later
- Kotlin 1.5 or later
- Android SDK 21 or later

## License

This project is open-source and available under the MIT License.
