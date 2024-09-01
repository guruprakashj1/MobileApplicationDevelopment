# Shapes and Icons Example

This Android app demonstrates how to create custom shapes and use vector icons in the UI using XML drawables.

## Features

- Custom shapes: circle, rectangle, and triangle
- Vector icon implementation
- Custom background for a TextView

## Code Structure

- `MainActivity.kt`: Basic activity setup
- `activity_main.xml`: Main layout file showcasing different shapes and icons
- Drawable XML files:
  - `circle_shape.xml`: Defines a circular shape
  - `rectangle_shape.xml`: Defines a rectangle with rounded corners
  - `triangle_shape.xml`: Defines a triangle using a vector drawable
  - `rounded_rectangle.xml`: Defines a rectangle with rounded corners for TextView background
  - `ic_custom_icon.xml`: Defines a custom vector icon

## How it works

1. The app displays various shapes created using XML drawables:
   - A circle using an oval shape
   - A rectangle with rounded corners
   - A triangle using a vector drawable
2. It also displays a custom vector icon
3. A TextView is shown with a custom rounded rectangle background

## Implementation Details

- Shape drawables are used to create basic shapes like circles and rectangles
- Vector drawables are used for more complex shapes (triangle) and icons
- Colors for shapes are defined in `colors.xml` for easy customization
- The layout uses a ScrollView to ensure all elements are accessible on smaller screens
- A custom background is applied to a TextView using a shape drawable

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

