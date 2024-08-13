# Android RadioButton Example

This project demonstrates how to effectively use the RadioButton component in an Android application using Kotlin. It showcases various RadioButton attributes, styles, and interaction handling methods.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/radiobuttonexample/
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

- Basic RadioButton
- RadioButton with custom text
- RadioButton with custom colors
- Disabled RadioButton
- RadioButton with custom drawable
- Programmatically created RadioButton
- RadioButtons within a RadioGroup
- RadioButton with custom layout

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling RadioButton interactions and demonstrating various RadioButton functionalities.

Key points:
- Sets up different types of RadioButtons
- Demonstrates how to handle RadioButton state changes
- Shows how to create and customize RadioButtons programmatically

### activity_main.xml

This layout file defines the UI of the app, including various RadioButtons with different styles and attributes.

### strings.xml, colors.xml

These files contain resources for text and colors used by the RadioButtons.

### custom_radio_button.xml

Defines a custom drawable for RadioButton states.

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example demonstrates various ways to use and customize RadioButtons. In a real-world application, you would typically use RadioButtons within a RadioGroup for mutually exclusive selections.
- Remember to handle RadioButton state changes appropriately in your app's logic.

