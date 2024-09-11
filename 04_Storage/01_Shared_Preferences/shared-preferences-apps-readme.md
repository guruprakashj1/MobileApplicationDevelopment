# SharedPreferences Example and Reader Apps

This project consists of two Android applications that demonstrate how to securely share data between separate apps using SharedPreferences and a ContentProvider.

## Overview

1. **SharedPreferencesExample**: This app allows users to input and save data (username and dark mode preference) using SharedPreferences. It also provides a ContentProvider to securely share this data with other apps.

2. **SharedPreferencesReader**: This app reads the data saved by the SharedPreferencesExample app using the provided ContentProvider.

## How They Work Together

These apps demonstrate a secure method of sharing data between two separate Android applications:

1. The SharedPreferencesExample app saves user data locally using SharedPreferences.
2. It then exposes this data through a ContentProvider, which acts as a secure interface for other apps to access the data.
3. The SharedPreferencesReader app requests access to this data through the ContentProvider.
4. The system manages the inter-app communication, ensuring that only authorized apps can access the shared data.

## SharedPreferencesExample App

### Key Components:

1. **MainActivity**: Allows users to input a username and toggle dark mode. Saves these preferences using SharedPreferences.

2. **PreferencesProvider**: A ContentProvider that reads data from SharedPreferences and makes it available to other apps.

3. **AndroidManifest.xml**: Declares the ContentProvider and defines a custom permission for reading preferences.

### How it Works:

1. User inputs data in the app's UI.
2. Data is saved to SharedPreferences.
3. The PreferencesProvider reads this data from SharedPreferences when queried.
4. The provider is declared in the manifest with a specific authority and custom read permission.

## SharedPreferencesReader App

### Key Components:

1. **MainActivity**: Reads and displays the shared preferences data from the SharedPreferencesExample app.

2. **AndroidManifest.xml**: Declares the use of the custom permission defined by the SharedPreferencesExample app.

### How it Works:

1. The app requests the custom permission in its manifest.
2. It uses a ContentResolver to query the SharedPreferencesExample app's ContentProvider.
3. The received data is displayed in the app's UI.

## Security Considerations

1. The SharedPreferencesExample app defines a custom permission (`com.example.sharedpreferencesexample.READ_PREFERENCES`) to control access to its data.
2. The SharedPreferencesReader app must declare this permission in its manifest to access the shared data.
3. The ContentProvider in the SharedPreferencesExample app only exposes specific data, maintaining control over what is shared.

## How to Use

1. Install both apps on the same device.
2. Open the SharedPreferencesExample app and input a username and set the dark mode preference.
3. Open the SharedPreferencesReader app to view the shared data.
4. Use the "Refresh Data" button in the SharedPreferencesReader app to fetch updated data.

## Technical Implementation

- Both apps are written in Kotlin.
- They use AndroidX libraries for UI components.
- The SharedPreferencesExample app implements a custom ContentProvider.
- The SharedPreferencesReader app uses a ContentResolver to query the provider.

## Potential Enhancements

1. Implement write capabilities in the SharedPreferencesReader app.
2. Add more complex data structures to be shared.
3. Implement real-time updates using ContentObserver in the reader app.

This project demonstrates a practical and secure way to share data between Android applications, adhering to Android's security model and best practices for inter-app communication.

