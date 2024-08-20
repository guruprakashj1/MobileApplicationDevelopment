# Discrete SeekBar Android Demo

This project demonstrates the implementation and usage of a discrete SeekBar in an Android application. A discrete SeekBar allows users to select from a predefined set of values, providing a more structured input method compared to a continuous SeekBar.

## Features

- Implements a discrete SeekBar with 10 predefined values
- Displays the currently selected value in real-time
- Demonstrates how to map SeekBar progress to custom values
- Uses the Material Design discrete SeekBar style

## Project Structure

- `MainActivity.kt`: The main activity that sets up the UI and handles SeekBar interactions
- `activity_main.xml`: The layout file that defines the UI, including the discrete SeekBar and a TextView for displaying the selected value
- `AndroidManifest.xml`: The manifest file that declares the application components

## How It Works

1. The SeekBar is initialized with a maximum value of 9 (corresponding to 10 discrete steps).
2. An array of custom values is defined: `[0, 2, 5, 10, 20, 50, 100, 200, 500, 1000]`.
3. As the user moves the SeekBar thumb, the `onProgressChanged` method is called.
4. The current progress is mapped to the corresponding value in the custom array.
5. The selected value is displayed in a TextView below the SeekBar.

## Key Components

### Discrete SeekBar

The discrete SeekBar is defined in the `activity_main.xml` file:

```xml
<SeekBar
    android:id="@+id/discreteSeekBar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    style="@style/Widget.AppCompat.SeekBar.Discrete"
    android:max="9"
    android:progress="0"/>
```

The `style="@style/Widget.AppCompat.SeekBar.Discrete"` attribute gives the SeekBar its discrete appearance.

### Custom Value Mapping

The custom values are defined in `MainActivity.kt`:

```kotlin
private val values = arrayOf(0, 2, 5, 10, 20, 50, 100, 200, 500, 1000)
```

The SeekBar progress is mapped to these values in the `updateValueText` function:

```kotlin
private fun updateValueText(progress: Int) {
    valueText.text = "Selected Value: ${values[progress]}"
}
```

## Usage

To use this project as a reference:

1. Clone the repository or copy the relevant files into your Android project.
2. Ensure your `build.gradle` file is set up correctly for Kotlin and Android.
3. Run the project on an emulator or physical device.

## Customization

You can customize the discrete SeekBar by:

- Modifying the `values` array to change the set of selectable values
- Adjusting the `android:max` attribute to match the number of discrete steps
- Customizing the appearance using themes and styles

## Best Practices

1. Use a discrete SeekBar when you have a specific set of values to choose from.
2. Ensure the number of steps (max attribute) matches the number of values in your custom array.
3. Consider using labels or tick marks to make the discrete steps more visible to the user.

## Requirements

- Android Studio 4.0+
- Android SDK 21+
- Kotlin 1.5+

## License

This project is open-source and available under the MIT License.

