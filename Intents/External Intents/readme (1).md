# External Intent Example

This Android application demonstrates the use of external intents in Kotlin to interact with other apps on the device. It shows how to open a web page, share text, send an email, and make a phone call using external intents.

## Project Structure

- `app/src/main/java/com/example/externalintentexample/`
  - `MainActivity.kt`: The main activity of the application.

- `app/src/main/res/layout/`
  - `activity_main.xml`: Layout file for MainActivity.

- `app/src/main/res/values/`
  - `themes.xml`: Contains the app's theme definition.

- `app/src/main/AndroidManifest.xml`: The app's manifest file.


# MainActivity.kt:

We set up four buttons for different external intent actions: opening a webpage, sharing text, sending an email, and making a phone call.

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

c. Send Email:

We create an Intent with ACTION_SENDTO and a "mailto:" Uri.
We add email details (recipient, subject, body) as extras.
We check if there's an app that can handle this intent and start it if available.

d. Make Call:

We create an Intent with ACTION_DIAL and a "tel:" Uri.
We check if there's an app that can handle this intent and start it if available.


# activity_main.xml:

We use ConstraintLayout for a responsive design.
We have four buttons vertically aligned in the center of the screen, each corresponding to an external intent action.


# themes.xml:

We define a custom theme that inherits from Material Design.
We set primary and secondary colors for the app.


 # AndroidManifest.xml:

We set up MainActivity as the launcher activity.
Note that we don't need to declare any special permissions for these intents, as the actual actions (browsing, sharing, emailing, calling) are performed by external apps.



This example demonstrates how to use external intents to interact with other apps on the device:

Opening a web page allows the user to view a website using their preferred browser.
Sharing text enables the user to send text content to other apps (e.g., messaging apps, social media).
Sending an email opens the user's preferred email client with pre-filled fields.
Making a call opens the phone app with a pre-dialed number.

External intents are powerful because they allow your app to request actions from other apps without needing to implement those features itself. This promotes inter-app communication and allows users to use their preferred apps for various tasks.
It's important to note that when using external intents, you should always check if there's an app available to handle the intent (using resolveActivity()) before starting the activity. This prevents crashes in case no suitable app is installed on the device.

## Features

- Open a web page using the default browser.
- Share text content with other apps.
- Send an email using the default email client.
- Make a phone call using the default phone app.

## How to Run

1. Clone this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Usage

1. Tap the "Open Webpage" button to open a web page in the default browser.
2. Tap the "Share Text" button to share some text using any compatible app.
3. Tap the "Send Email" button to compose an email using the default email client.
4. Tap the "Make Call" button to initiate a phone call using the default phone app.

## Requirements

- Android Studio Arctic Fox or later
- Kotlin 1.5 or later
- Android SDK 21 or later

## License

This project is open-source and available under the MIT License.
