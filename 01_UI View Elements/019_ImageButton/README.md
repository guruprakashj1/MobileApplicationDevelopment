# Android ImageButton Example

This project demonstrates how to effectively use the ImageButton component in an Android application using Kotlin. It showcases various ImageButton attributes, styles, and click handling methods.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/imagebuttonexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   └── styles.xml
│   │   │   └── drawable/
│   │   │       ├── custom_imagebutton_background.xml
│   │   │       └── custom_imagebutton_selector.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Standard ImageButton with click listener
- ImageButton with custom background
- ImageButton with selector for different states
- ImageButton with custom padding and scaling
- ImageButton with long click listener
- ImageButton with custom style

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling ImageButton clicks and demonstrating various ImageButton functionalities.

Key points:
- Sets up click listeners for different ImageButtons
- Demonstrates how to handle both short and long clicks
- Shows how to change ImageButton properties programmatically

### activity_main.xml

This layout file defines the UI of the app, including various ImageButtons with different styles and attributes.

### strings.xml, styles.xml

These files contain resources for text and styles used by the ImageButtons.

### custom_imagebutton_background.xml, custom_imagebutton_selector.xml

Define custom drawables for ImageButton backgrounds and state selectors.

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example demonstrates various ways to customize and use ImageButtons. In a real-world application, you would typically choose a consistent style for buttons throughout your app.
- Remember to provide appropriate feedback to users when buttons are pressed, especially for operations that may take some time to complete.
- Always provide content descriptions for ImageButtons to ensure accessibility.

