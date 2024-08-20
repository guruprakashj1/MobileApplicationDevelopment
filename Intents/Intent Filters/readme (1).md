# Intent Filter Example

This Android application demonstrates the use of Intent Filters in Kotlin. It shows how to create an activity that can receive intents from other apps, specifically for sharing text and images.

## Project Structure

- `app/src/main/java/com/example/intentfilterexample/`
  - `MainActivity.kt`: The main activity of the application that handles received intents.

- `app/src/main/res/layout/`
  - `activity_main.xml`: Layout file for MainActivity.

- `app/src/main/res/values/`
  - `themes.xml`: Contains the app's theme definition.

- `app/src/main/AndroidManifest.xml`: The app's manifest file, crucial for defining intent filters.

# MainActivity.kt:

In onCreate(), we check the intent that started the activity.
If the action is ACTION_SEND, we further check the MIME type:

For text, we call handleSendText()
For images, we call handleSendImage()


If it's not a share intent, we display a welcome message.
handleSendText() extracts the shared text from the intent and displays it.
handleSendImage() extracts the image URI from the intent and displays it.


# activity_main.xml:

Contains a single TextView that displays either the welcome message or the shared content.


# AndroidManifest.xml:

This is the key file for setting up intent filters.
We define three intent filters for MainActivity:
a. The default launcher intent filter.
b. An intent filter for receiving shared text:

Action: ACTION_SEND
Category: DEFAULT
Data: MIME type "text/*"
c. An intent filter for receiving shared images:
Action: ACTION_SEND
Category: DEFAULT
Data: MIME type "image/*"





Key Concepts:

Intent Filters:

Declare the types of intents that an activity can receive from other apps.
Defined in the AndroidManifest.xml file.
Consist of one or more actions, categories, and data specifications.


<action> element:

Specifies the action that the activity can respond to.
In this case, we use ACTION_SEND for both text and image sharing.


<category> element:

Provides additional information about the kind of component that should handle the intent.
We use DEFAULT category, which is required for activities to receive implicit intents.


<data> element:

Specifies the type of data that the activity can handle.
We use MIME types "text/" for text and "image/" for images.


android:exported="true":

Allows the activity to be started by components of other applications.



This example demonstrates how to use intent filters to make your app capable of receiving shared content from other apps. When a user tries to share text or an image from another app, this app will appear in the share menu. When selected, it will receive the shared content and display it.
The intent filters in the manifest file are crucial for this functionality. They tell the Android system what types of intents your app can handle, allowing it to be presented as an option when other apps initiate those types of intents.

## Features

- Receive and display shared text from other apps.
- Receive and display the URI of shared images from other apps.
- Act as a normal app when opened directly.

## How to Run

1. Clone this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Usage

1. Install the app on your device.
2. From another app (e.g., a browser or gallery), choose to share text or an image.
3. Select this app from the share menu.
4. The shared content will be displayed in this app.

## Requirements

- Android Studio Arctic Fox or later
- Kotlin 1.5 or later
- Android SDK 21 or later

## License

This project is open-source and available under the MIT License.
