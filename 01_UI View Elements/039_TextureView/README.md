# RatingBar Android Demo

This project demonstrates the basic usage of RatingBar in an Android application.

## Overview

RatingBar is an Android widget that allows users to input a rating by selecting a number of stars. This demo shows how to:

1. Add a RatingBar to your layout
2. Respond to rating changes
3. Display the current rating

## Project Structure

- `MainActivity.kt`: Contains the logic for handling RatingBar interactions
- `activity_main.xml`: Defines the layout with RatingBar and TextView
- `AndroidManifest.xml`: Standard Android manifest file

## Key Components

### RatingBar XML

```xml
<RatingBar
    android:id="@+id/ratingBar"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:numStars="5"
    android:stepSize="0.5"
    android:rating="2.5" />
```

### Kotlin Code

```kotlin
ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
    ratingDisplay.text = "Rating: $rating"
}
```

## Features

- 5-star rating system
- Half-star precision (0.5 step size)
- Real-time display of the selected rating

## Usage

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Customization

- Change `android:numStars` to adjust the number of stars
- Modify `android:stepSize` to change rating precision
- Adjust `android:rating` to set a different default rating

## Requirements

- Android Studio 4.0+
- Android SDK 21+
- Kotlin 1.5+

## License

This project is open-source and available under the MIT License.

