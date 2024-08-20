# Implicit Intent Example

This Android application demonstrates the use of implicit intents in Kotlin to perform common actions like opening a web page, sharing text, and picking an image from the gallery.

## Project Structure

- `app/src/main/java/com/example/implicitintentexample/`
  - `MainActivity.kt`: The main activity of the application.

- `app/src/main/res/layout/`
  - `activity_main.xml`: Layout file for MainActivity.

- `app/src/main/res/values/`
  - `themes.xml`: Contains the app's theme definition.

- `app/src/main/AndroidManifest.xml`: The app's manifest file.

# MainActivity.kt:

We set up three buttons for different implicit intent actions: opening a webpage, sharing text, and picking an image.
We also set up an ImageView to display the picked image.
For image picking, we use the new ActivityResult API (registerForActivityResult) which replaces the deprecated onActivityResult method.

a. Open Webpage:

We create a Uri object from the URL string.
We create an Intent with ACTION_VIEW and the Uri.
We check if there's an app that can handle this intent using resolveActivity().
If an app is available, we start the activity; otherwise, we show a toast message.

b. Share Text:

We create an Intent and set its action to ACTION_SEND.
We set the MIME type to "text/plain".
We add the text to be shared as an extra.
We use createChooser() to allow the user to choose which app to use for sharing.

c. Pick Image:

We use the ActivityResult API to launch the image picker.
When an image is selected, we set it to the ImageView.


# activity_main.xml:

We use ConstraintLayout for a responsive design.
We have three buttons vertically aligned in the center of the screen.
Below the buttons, we have an ImageView to display the picked image.


# themes.xml:

We define a custom theme that inherits from Material Design.
We set primary and secondary colors for the app.


# AndroidManifest.xml:

We declare the INTERNET permission, which is needed for opening web pages.
We set up MainActivity as the launcher activity.



This example demonstrates how to use implicit intents for common tasks:

Opening a web page allows the user to view a website using their preferred browser.
Sharing text enables the user to send text content to other apps (e.g., email, messaging apps).
Picking an image shows how to interact with the gallery or other image providers.

Implicit intents are powerful because they allow your app to request an action without needing to know which app will perform the action. This promotes inter-app communication and allows users to use their preferred apps for various tasks.

## Features

- Open a web page using an implicit intent.
- Share text content using an implicit intent.
- Pick an image from the gallery using an implicit intent.
- Display the picked image in the app.

## How to Run

1. Clone this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Usage

1. Tap the "Open Webpage" button to open a web page in the default browser.
2. Tap the "Share Text" button to share some text using any compatible app.
3. Tap the "Pick Image" button to select an image from the gallery and display it in the app.

## Requirements

- Android Studio Arctic Fox or later
- Kotlin 1.5 or later
- Android SDK 21 or later

## License

This project is open-source and available under the MIT License.
