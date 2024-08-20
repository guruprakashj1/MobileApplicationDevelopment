# SeekBar Android Demo

This project demonstrates the implementation and usage of a SeekBar in an Android application. The SeekBar is a user interface component that allows users to select a value from a continuous range by sliding a thumb along a horizontal line.

## Features

- Implements a basic SeekBar with a range from 0 to 100
- Displays the current progress of the SeekBar in real-time
- Demonstrates how to handle SeekBar change events

## Project Structure

- `MainActivity.kt`: The main activity that sets up the UI and handles SeekBar interactions
- `activity_main.xml`: The layout file that defines the UI, including the SeekBar and a TextView for displaying progress
- `AndroidManifest.xml`: The manifest file that declares the application components

## How It Works

1. The SeekBar is initialized with a maximum value of 100 and a default progress of 50.
2. As the user moves the SeekBar thumb, the `onProgressChanged` method is called.
3. The current progress is displayed in a TextView below the SeekBar.

## Key Components

### SeekBar

The SeekBar is defined in the `activity_main.xml` file:

```xml
<SeekBar
    android:id="@+id/seekBar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:max="100"
    android:progress="50"/>
```

### SeekBar Listener

The SeekBar listener is set up in `MainActivity.kt`:

```kotlin
seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        updateProgressText(progress)
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        // Called when the user starts interacting with the SeekBar
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        // Called when the user stops interacting with the SeekBar
    }
})
```

## Usage

To use this project as a reference:

1. Clone the repository or copy the relevant files into your Android project.
2. Ensure your `build.gradle` file is set up correctly for Kotlin and Android.
3. Run the project on an emulator or physical device.

## Customization

You can customize the SeekBar by modifying its attributes in the XML layout:

- Change the range by modifying the `android:max` attribute
- Set a different default value with the `android:progress` attribute
- Customize the appearance using themes and styles

## Requirements

- Android Studio 4.0+
- Android SDK 21+
- Kotlin 1.5+

## License

This project is open-source and available under the MIT License.

