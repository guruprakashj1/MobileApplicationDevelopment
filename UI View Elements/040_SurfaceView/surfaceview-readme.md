# SurfaceView Android Demo

This project demonstrates the basic usage of SurfaceView in an Android application. SurfaceView provides a dedicated drawing surface within the view hierarchy. It's particularly useful for animations, games, or other scenarios where you need to perform continuous, fast-paced rendering.

## Overview

In this demo, we use SurfaceView to display a simple bouncing ball animation. The ball moves around the screen, bouncing off the edges, demonstrating how SurfaceView can be used for custom animations.

## Project Structure

- `MainActivity.kt`: Contains the logic for setting up the SurfaceView and implementing the bouncing ball animation
- `activity_main.xml`: A basic layout file (not used in this example as we set the content view programmatically)
- `AndroidManifest.xml`: Declares the application components and permissions
- `themes.xml`: Defines the app's theme

## Key Components

### SurfaceView Implementation

The SurfaceView is implemented as an inner class `BouncingBallView` within `MainActivity`. It handles the drawing surface and animation logic.

```kotlin
private inner class BouncingBallView(context: Context) : SurfaceView(context), Runnable {
    // Implementation details...
}
```

### Drawing on SurfaceView

```kotlin
private fun draw() {
    if (surfaceHolder.surface.isValid) {
        val canvas: Canvas = surfaceHolder.lockCanvas()
        canvas.drawColor(Color.WHITE)
        canvas.drawCircle(cx, cy, radius, paint)
        surfaceHolder.unlockCanvasAndPost(canvas)
    }
}
```

## Features

- Uses SurfaceView to display custom graphics
- Implements a simple bouncing ball animation
- Demonstrates how to manage the drawing thread for smooth animation

## Usage

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Key Points

1. SurfaceView provides a dedicated drawing surface separate from the view hierarchy.
2. It's suitable for continuous rendering and fast-paced graphics.
3. You need to manage the drawing thread manually.
4. Use `SurfaceHolder.lockCanvas()` and `SurfaceHolder.unlockCanvasAndPost()` for drawing.

## When to Use SurfaceView

- For games with frequent updates
- Continuous animations or video playback
- Camera previews
- Any scenario requiring fast, frequent updates to the display

## Requirements

- Android Studio 4.0+
- Android SDK 21+
- Kotlin 1.5+

## License

This project is open-source and available under the MIT License.
