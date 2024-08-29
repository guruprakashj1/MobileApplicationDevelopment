# Fragment Communication with Menu

This Android project demonstrates how to implement fragment communication using a menu in Kotlin. The app consists of a main activity with a menu that allows switching between two fragments.

## Project Structure

- `MainActivity`: Hosts the fragments and handles menu interactions.
- `FirstFragment`: Displays "First Fragment" text.
- `SecondFragment`: Displays "Second Fragment" text.
- `activity_main.xml`: Main layout file containing a FrameLayout for fragment container.
- `fragment_first.xml`: Layout for the first fragment.
- `fragment_second.xml`: Layout for the second fragment.
- `main_menu.xml`: Menu resource file defining the menu items.

## How it works

1. The MainActivity inflates the menu using `onCreateOptionsMenu()`.
2. When a menu item is selected, `onOptionsItemSelected()` is called.
3. Based on the selected menu item, the appropriate fragment is replaced in the container.
4. Fragment transactions are handled using the `supportFragmentManager`.

## Running the app

1. Open the project in Android Studio.
2. Build and run the app on an emulator or physical device.
3. Use the menu options to switch between fragments.

This example demonstrates a simple implementation of fragment communication using a menu. You can expand on this concept to create more complex apps with multiple fragments and advanced navigation patterns.
