# PreferencesProvider for SharedPreferences Example

## Overview

This README explains the `PreferencesProvider` class, a custom ContentProvider that allows controlled access to shared preferences data across different Android applications.

## Purpose

The `PreferencesProvider` enables other apps to read specific shared preferences data from this app in a secure and controlled manner. It exposes the "username" and "darkMode" preferences through a ContentProvider interface.

## Key Components

### 1. PreferencesProvider Class

```kotlin
class PreferencesProvider : ContentProvider()
```

This class extends `ContentProvider`, providing an interface for cross-application data access.

### 2. onCreate() Method

```kotlin
override fun onCreate(): Boolean = true
```

Called when the provider is created. Returns `true` to indicate successful creation.

### 3. query() Method

```kotlin
override fun query(
    uri: Uri,
    projection: Array<out String>?,
    selection: String?,
    selectionArgs: Array<out String>?,
    sortOrder: String?
): Cursor
```

This is the main method implemented in the provider. It's called when another app requests data.

Functionality:
- Accesses shared preferences named "MyPrefs"
- Creates a MatrixCursor with "key" and "value" columns
- Adds rows for "username" and "darkMode" preferences
- Returns the cursor with preference data

### 4. Other ContentProvider Methods

```kotlin
override fun insert(uri: Uri, values: ContentValues?): Uri? = null
override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int = 0
override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int = 0
override fun getType(uri: Uri): String? = null
```

These methods are implemented with default return values as this provider is designed only for reading preferences, not modifying them.

## AndroidManifest.xml Configuration

The PreferencesProvider is registered in the AndroidManifest.xml:

```xml
<provider
    android:name=".PreferencesProvider"
    android:authorities="com.example.sharedpreferencesexample.provider"
    android:exported="true"
    android:readPermission="com.example.sharedpreferencesexample.READ_PREFERENCES" />
```

This declaration specifies:
- The provider's class name
- Its authority (used in URIs to access this provider)
- That it's exported (accessible to other apps)
- A custom permission required to read from this provider

## Security

By using this ContentProvider, the app can securely share specific preference data with other apps while maintaining control over what data is shared and how it's accessed. The custom permission `com.example.sharedpreferencesexample.READ_PREFERENCES` ensures that only authorized apps can read the shared preferences.

## Usage

Other apps can query this ContentProvider to read the "username" and "darkMode" preferences if they have the necessary permission. This allows for controlled data sharing between apps while maintaining the security of the shared preferences.

## Note

This implementation is designed for read-only access to specific shared preferences. If write access or access to other preferences is required, the `PreferencesProvider` class and the corresponding permissions in the AndroidManifest.xml would need to be modified accordingly.

