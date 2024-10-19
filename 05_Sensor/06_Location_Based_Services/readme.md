# Google Maps Android Example

This project demonstrates how to integrate Google Maps into an Android application using Kotlin. It provides a simple implementation of displaying a map with a marker.

## Table of Contents
1. [Concept](#concept)
2. [Prerequisites](#prerequisites)
3. [Project Structure](#project-structure)
4. [Key Components](#key-components)
5. [Setup and Configuration](#setup-and-configuration)
6. [Running the Application](#running-the-application)
7. [Customization](#customization)
8. [Troubleshooting](#troubleshooting)

## Concept

The main concept of this project is to showcase how to:
- Set up a Google Maps SDK in an Android application
- Display a Google Map in an Android activity
- Add a marker to the map at a specific location

This example serves as a starting point for more complex map-based applications.

## Prerequisites

Before you begin, ensure you have:
- Android Studio installed (latest version recommended)
- A Google Cloud Platform account
- A Google Maps API key

## Project Structure

The project follows a standard Android application structure:

```
app/
├── src/main/
│   ├── java/com/example/googlemapsexample/
│   │   └── MainActivity.kt
│   ├── res/layout/
│   │   └── activity_main.xml
│   └── AndroidManifest.xml
├── build.gradle.kts
└── ...
build.gradle.kts
settings.gradle.kts
gradle.properties
local.properties
```

## Key Components

### 1. MainActivity.kt

This is the main activity of the application. It initializes the map and sets up a marker.

Key points:
- Implements `OnMapReadyCallback` to handle map initialization
- Uses view binding for easy access to layout elements
- Sets up a marker in Sydney, Australia (you can change this location)

### 2. activity_main.xml

This layout file contains a `fragment` that will host the Google Map.

### 3. AndroidManifest.xml

The manifest file declares necessary permissions and includes the Google Maps API key.

### 4. build.gradle.kts (Module level)

This file includes necessary dependencies and plugin configurations for Google Maps.

## Setup and Configuration

1. Clone this repository
2. Open the project in Android Studio
3. In the Google Cloud Console:
   - Create a new project (or use an existing one)
   - Enable the Google Maps Android API
   - Create an API key
4. Add your API key to `local.properties`:
   ```
   MAPS_API_KEY=your_api_key_here
   ```
5. Sync the project with Gradle files

## Running the Application

1. Connect an Android device or start an emulator
2. Click the "Run" button in Android Studio
3. The app should launch, displaying a map centered on Sydney with a marker

## Customization

To customize the initial map location:
1. Open `MainActivity.kt`
2. Locate the `onMapReady` function
3. Modify the `LatLng` object to your desired coordinates
4. Optionally, adjust the camera zoom level

Example:
```kotlin
val newYork = LatLng(40.7128, -74.0060)
mMap.addMarker(MarkerOptions().position(newYork).title("Marker in New York"))
mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(newYork, 12f))
```

## Troubleshooting

If you encounter issues:
1. Ensure your API key is correctly set in `local.properties`
2. Verify that you've enabled the Google Maps Android API in the Google Cloud Console
3. Check that you've included the correct SHA-1 fingerprint in the Google Cloud Console
4. Make sure you have the latest version of Google Play Services installed on your emulator or device
5. Clean and rebuild the project in Android Studio

For more detailed information, refer to the [official Google Maps documentation](https://developers.google.com/maps/documentation/android-sdk/overview).
