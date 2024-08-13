# Android RadioGroup Example

This project demonstrates how to effectively use the RadioGroup component along with RadioButtons in an Android application using Kotlin. It showcases various RadioGroup attributes, styles, and interaction handling methods.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/radiogroupexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   └── colors.xml
│   │   │   └── drawable/
│   │   │       └── custom_radio_button.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Basic RadioGroup with RadioButtons
- RadioGroup with custom layout (horizontal)
- RadioGroup with custom styled RadioButtons
- Programmatically created RadioGroup and RadioButtons
- Handling RadioButton selection changes
- RadioGroup with images

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling RadioGroup interactions and demonstrating various RadioGroup and RadioButton functionalities.

Key points:
- Sets up different types of RadioGroups
- Demonstrates how to handle RadioButton selection changes
- Shows how to create and customize RadioGroups and RadioButtons programmatically

### activity_main.xml

This layout file defines the UI of the app, including various RadioGroups with different styles and attributes.

### strings.xml, colors.xml

These files contain resources for text and colors used by the RadioGroups and RadioButtons.

### custom_radio_button.xml

Defines a custom drawable for RadioButton states.

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example demonstrates various ways to use RadioGroups and RadioButtons. In a real-world application, you would typically choose a consistent style and behavior for these components throughout your app.
- RadioGroups are used for single-selection scenarios where only one option can be selected at a time.
- Remember to handle RadioButton selection changes appropriately in your app's logic.

