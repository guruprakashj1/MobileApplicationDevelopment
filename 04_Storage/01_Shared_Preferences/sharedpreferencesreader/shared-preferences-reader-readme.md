# SharedPreferences Reader Example for Android

This project demonstrates how to read SharedPreferences data from another Android application using a ContentProvider. It complements the SharedPreferences example app by showcasing inter-app data sharing in Android.

## Table of Contents

1. [Overview](#overview)
2. [Key Concepts](#key-concepts)
3. [Project Structure](#project-structure)
4. [Implementation Details](#implementation-details)
5. [How to Use](#how-to-use)
6. [Security Considerations](#security-considerations)
7. [Troubleshooting](#troubleshooting)

## Overview

This Android application showcases the following features:
- Requesting and using a custom permission to access data from another app
- Querying a ContentProvider to read SharedPreferences data from another app
- Displaying the retrieved data in a simple user interface

## Key Concepts

### Custom Permissions

Custom permissions allow apps to control access to their components. In this example, we request a custom permission defined by the SharedPreferences provider app to access its ContentProvider.

### ContentProvider

A ContentProvider is a component in Android that manages access to a structured set of data. It encapsulates the data and provides mechanisms for defining data security. In this example, we query a ContentProvider to access SharedPreferences data from another app.

## Project Structure

The project consists of the following main components:

1. `MainActivity.kt`: The main activity of the app, handling the UI and data retrieval from the ContentProvider.
2. `AndroidManifest.xml`: The manifest file that declares the app's components and requested permissions.
3. `activity_main.xml`: The layout file for the main activity.

## Implementation Details

### MainActivity (MainActivity.kt)

This activity demonstrates how to:
- Query a ContentProvider to retrieve SharedPreferences data from another app
- Display the retrieved data in the UI
- Implement a refresh mechanism to update the displayed data

Key method:
```kotlin
private fun loadSharedPreferences() {
    try {
        val uri = Uri.parse("content://com.example.sharedpreferencesexample.provider")
        val cursor = contentResolver.query(uri, null, null, null, null)

        cursor?.use {
            val data = mutableMapOf<String, String>()
            while (it.moveToNext()) {
                val key = it.getString(it.getColumnIndexOrThrow("key"))
                val value = it.getString(it.getColumnIndexOrThrow("value"))
                data[key] = value
            }

            val username = data["username"] ?: "Not set"
            val darkMode = data["darkMode"]?.toBoolean() ?: false

            tvSharedData.text = "Shared Preferences from other app:\n\n" +
                    "Username: $username\n" +
                    "Dark Mode: $darkMode"
        }
    } catch (e: Exception) {
        tvSharedData.text = "Error: Unable to access shared preferences from other app.\n" +
                "Make sure the other app is installed and has run at least once.\n" +
                "Error: ${e.message}"
    }
}
```

Key points:
- The ContentProvider is accessed using its authority URI: `content://com.example.sharedpreferencesexample.provider`
- The `contentResolver.query()` method is used to retrieve data from the ContentProvider
- The cursor returned by the query is processed to extract key-value pairs
- Error handling is implemented to provide user feedback if data access fails

### AndroidManifest.xml

The manifest file declares:
- The main activity
- The custom permission required to access the SharedPreferences data

Key element:
```xml
<uses-permission android:name="com.example.sharedpreferencesexample.READ_PREFERENCES" />
```

This line requests the custom permission defined by the SharedPreferences provider app.

### Layout (activity_main.xml)

The layout includes:
- A TextView to display the retrieved SharedPreferences data
- A Button to refresh the data

## How to Use

1. Install and run the SharedPreferences provider app at least once to ensure it has created its SharedPreferences file.
2. Install and run this SharedPreferences reader app.
3. The app will attempt to read and display the SharedPreferences data from the provider app.
4. Click the "Refresh Data" button to update the displayed data.

## Security Considerations

- This app relies on a custom permission defined by the SharedPreferences provider app. Ensure that the permission is properly implemented and has an appropriate protection level.
- Be cautious when sharing sensitive data between apps, even when using custom permissions.
- In a production environment, consider implementing additional security measures such as signature-level permissions or encrypted data transmission.

## Troubleshooting

If you encounter issues:

1. Ensure both the SharedPreferences provider app and this reader app are installed on the same device.
2. Verify that the SharedPreferences provider app has been run at least once to create its SharedPreferences file.
3. Check that the custom permission name in this app's manifest matches the one defined in the provider app.
4. Verify that the ContentProvider authority URI in `MainActivity.kt` matches the one defined in the provider app.
5. If you've recently updated either app, try uninstalling and reinstalling both to ensure permission changes are applied.

Remember that this example is designed to work specifically with the companion SharedPreferences provider app. It may not work with other apps unless they implement a similar ContentProvider and permission structure.
