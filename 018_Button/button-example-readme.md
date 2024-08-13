# Android Button Example

This project demonstrates how to effectively use different types of buttons in an Android application using Kotlin. It showcases various button styles, attributes, and click handling methods.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/buttonexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   └── styles.xml
│   │   │   └── drawable/
│   │   │       └── custom_button_background.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Standard Button with click listener
- Material Design Button
- Outlined Button
- Text Button
- Icon Button
- Toggle Button
- Custom styled Button
- Disabled Button
- Button with long click listener
- FloatingActionButton

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling button clicks and demonstrating various button functionalities.

Key points:
- Sets up click listeners for different types of buttons
- Demonstrates how to handle button states (e.g., toggling)
- Shows how to change button properties programmatically

### activity_main.xml

This layout file defines the UI of the app, including various types of buttons with different styles and attributes.

### strings.xml

Contains string resources used for button labels.

### styles.xml

Defines custom styles for buttons.

### custom_button_background.xml

Defines a custom drawable for button background.

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example demonstrates a wide range of button types and styles. In a real-world application, you would typically use a subset of these based on your specific UI requirements.
- Consider the design guidelines of the platform (e.g., Material Design for Android) when choosing button styles for your app.
- Remember to provide appropriate feedback to users when buttons are pressed, especially for operations that may take some time to complete.

