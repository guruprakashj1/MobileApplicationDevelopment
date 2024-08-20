# Dividers Android Demo

This project demonstrates the use of horizontal and vertical dividers in an Android application. It showcases dividers in both a LinearLayout and a RecyclerView.

## Overview

The app displays two sections:
1. A LinearLayout with manually added dividers between items.
2. A RecyclerView with dividers added using ItemDecoration.

## Project Structure

- `MainActivity.kt`: Sets up the UI and configures the RecyclerView with dividers.
- `SimpleAdapter.kt`: A basic RecyclerView adapter for displaying list items.
- `activity_main.xml`: Defines the layout with a LinearLayout and RecyclerView.
- `AndroidManifest.xml`: Declares the application components.
- `themes.xml`: Defines the app's theme.

## Key Components

### LinearLayout Dividers

In `activity_main.xml`, dividers are added as `View` elements between items:

```xml
<View
    android:layout_width="match_parent"
    android:layout_height="1dp"
    android:background="?android:attr/listDivider" />
```

### RecyclerView Dividers

In `MainActivity.kt`, a `DividerItemDecoration` is added to the RecyclerView:

```kotlin
val dividerItemDecoration = DividerItemDecoration(
    recyclerView.context,
    (recyclerView.layoutManager as LinearLayoutManager).orientation
)
recyclerView.addItemDecoration(dividerItemDecoration)
```

## Features

- Demonstrates horizontal dividers in a vertical LinearLayout
- Shows how to add dividers to a RecyclerView using ItemDecoration
- Uses the system's default list divider style for consistency

## Usage

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Key Points

1. For LinearLayouts, dividers can be added manually as View elements.
2. For RecyclerViews, use DividerItemDecoration for a more efficient approach.
3. The `?android:attr/listDivider` attribute refers to the system's default divider style.
4. Dividers can be customized by creating custom drawables or item decorations.

## When to Use Dividers

- To visually separate items in a list or layout
- To improve readability and organization of content
- When you want to create clear distinctions between sections or items

## Requirements

- Android Studio 4.0+
- Android SDK 21+
- Kotlin 1.5+

## License

This project is open-source and available under the MIT License.
