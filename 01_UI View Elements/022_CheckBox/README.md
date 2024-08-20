# Android CheckBox Example

This project demonstrates how to effectively use the CheckBox component in an Android application using Kotlin. It showcases various CheckBox attributes, styles, and interaction handling methods.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/checkboxexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   └── colors.xml
│   │   │   └── drawable/
│   │   │       └── custom_checkbox.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Basic CheckBox
- CheckBox with custom text
- CheckBox with custom colors
- Disabled CheckBox
- CheckBox with custom drawable
- Programmatically created CheckBox
- Handling CheckBox state changes
- Group of related CheckBoxes

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling CheckBox interactions and demonstrating various CheckBox functionalities.

Key points:
- Sets up different types of CheckBoxes
- Demonstrates how to handle CheckBox state changes
- Shows how to create and customize CheckBoxes programmatically

### activity_main.xml

This layout file defines the UI of the app, including various CheckBoxes with different styles and attributes.

### strings.xml, colors.xml

These files contain resources for text and colors used by the CheckBoxes.

### custom_checkbox.xml

Defines a custom drawable for CheckBox states.

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example demonstrates various ways to use and customize CheckBoxes. In a real-world application, you would typically choose a consistent style and behavior for CheckBoxes throughout your app.
- CheckBoxes are often used for multiple selection scenarios or for toggling options on and off.
- Remember to handle CheckBox state changes appropriately in your app's logic.

