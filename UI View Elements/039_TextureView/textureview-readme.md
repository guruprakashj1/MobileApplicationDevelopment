# TextureView Android Demo

This project demonstrates the basic usage of TextureView in an Android application. TextureView is a view that renders content using hardware acceleration, making it suitable for displaying video playback or OpenGL scenes.

## Overview

In this demo, we use TextureView to display a simple animated circle. The circle rotates continuously, showcasing how TextureView can be used for animations and custom drawing.

## Project Structure

- `MainActivity.kt`: Contains the logic for setting up the TextureView and drawing on it
- `activity_main.xml`: Defines the layout with the TextureView
- `AndroidManifest.xml`: Standard Android manifest file (not shown in the provided code)

## Key Components

### TextureView in XML

```xml
<TextureView
    android:id="@+id/textureView"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

### TextureView Setup in Kotlin

```kotlin
textureView = findViewById(R.id.textureView)
textureView.surfaceTextureListener = this
```

### Drawing on TextureView

```kotlin
private fun drawCircle() {
    val canvas = textureView.lockCanvas()
    canvas?.let {
        it.drawColor(Color.WHITE)
        it.drawCircle(centerX, centerY, radius, paint)
        textureView.unlockCanvasAndPost(it)
    }
}
```

## Features

- Uses TextureView to display custom graphics
- Implements a simple animation (rotation) on the TextureView
- Demonstrates how to draw on a TextureView using Canvas

## Usage

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Key Points

1. TextureView is hardware accelerated and can be used in the view hierarchy.
2. It's suitable for continuous rendering, like video playback or OpenGL scenes.
3. You need to implement `TextureView.SurfaceTextureListener` to handle lifecycle events of the surface texture.
4. Use `lockCanvas()` and `unlockCanvasAndPost()` to draw on the TextureView.

## When to Use TextureView

- For displaying video content
- When you need to apply transformations (scale, rotate) to the entire surface
- In scenarios where you need to animate or move the entire rendered content

## Requirements

- Android Studio 4.0+
- Android SDK 21+
- Kotlin 1.5+

## License

This project is open-source and available under the MIT License.

