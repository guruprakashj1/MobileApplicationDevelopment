# Android Switch Example

This project demonstrates how to effectively use the Switch component in an Android application using Kotlin. It showcases various Switch attributes, styles, and interaction handling methods.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/switchexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   └── colors.xml
│   │   │   └── drawable/
│   │   │       └── custom_switch_thumb.xml
│   │   │       └── custom_switch_track.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Basic Switch
- Switch with custom text
- Switch with custom colors
- Disabled Switch
- Switch with custom thumb and track
- Programmatically created Switch
- Switch controlling app functionality
- Switch with custom layout

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling Switch interactions and demonstrating various Switch functionalities.

Key points:
- Sets up different types of Switches
- Demonstrates how to handle Switch state changes
- Shows how to create and customize Switches programmatically
- Illustrates how to use Switches to control app functionality

### activity_main.xml

This layout file defines the UI of the app, including various Switches with different styles and attributes.

### strings.xml, colors.xml

These files contain resources for text and colors used by the Switches.

### custom_switch_thumb.xml, custom_switch_track.xml

Define custom drawables for Switch thumb and track states.

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example demonstrates various ways to use and customize Switches. In a real-world application, you would typically use Switches for binary on/off states or to toggle features.
- Remember to handle Switch state changes appropriately in your app's logic.

