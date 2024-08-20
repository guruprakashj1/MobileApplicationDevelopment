# Android TextView Example

This project demonstrates how to effectively use TextView in an Android application using Kotlin. It showcases various features and styling options of TextView, including different text styles, colors, sizes, and more advanced features like spannable strings and auto-linking.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/textviewexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   └── colors.xml
│   │   │   └── drawable/
│   │   │       └── custom_background.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Basic TextView with different text styles (bold, italic, underline)
- TextView with custom font size and color
- TextView with custom background
- TextView with compound drawables
- TextView with auto-linking (phone numbers, web URLs, email addresses)
- TextView with clickable spans
- TextView with multiple styles in a single text (using SpannableStringBuilder)
- TextView with custom line spacing and letter spacing
- TextView with text shadow
- TextView with marquee effect for long text

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for setting up and customizing various TextViews.

Key points:
- Demonstrates programmatic customization of TextViews
- Shows how to create and apply SpannableStringBuilder for complex text styling
- Implements click listeners for clickable spans

### activity_main.xml

This layout file defines the UI of the app, including multiple TextViews with different styles and attributes.

### strings.xml

Contains string resources used in the app.

### colors.xml

Defines custom colors used for text and backgrounds.

### custom_background.xml

Defines a custom drawable background for one of the TextViews.

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example demonstrates a wide range of TextView features. In a real-world application, you would typically use a subset of these features as needed for your specific UI requirements.
- Consider the readability and accessibility of your text when choosing colors, sizes, and styles.
- For more complex text layouts or when dealing with large amounts of text, consider using alternative views like RecyclerView with custom item layouts.

