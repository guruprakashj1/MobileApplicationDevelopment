# Fragment Lifecycle Demo

This Android project demonstrates the complete lifecycle of a Fragment using Kotlin. It includes a simple UI that allows users to add and remove a fragment, triggering various lifecycle events.

## Project Structure

- `MainActivity`: The main activity that hosts the fragment and provides buttons to add/remove the fragment.
- `LifecycleFragment`: A fragment that logs all lifecycle events.
- `activity_main.xml`: Layout for the main activity.
- `fragment_lifecycle.xml`: Layout for the lifecycle fragment.
- `AndroidManifest.xml`: The app manifest file.
- `themes.xml`: The app's theme file.

## Fragment Lifecycle Events

The `LifecycleFragment` class overrides all lifecycle methods and logs them using Android's `Log.d()` function. The lifecycle events are:

1. `onAttach()`
2. `onCreate()`
3. `onCreateView()`
4. `onViewCreated()`
5. `onStart()`
6. `onResume()`
7. `onPause()`
8. `onStop()`
9. `onDestroyView()`
10. `onDestroy()`
11. `onDetach()`

## How to Use

1. Run the app on an Android device or emulator.
2. Tap the "Add Fragment" button to add the LifecycleFragment to the activity.
3. Observe the logcat output to see the lifecycle events being called.
4. Tap the "Remove Fragment" button to remove the LifecycleFragment from the activity.
5. Again, observe the logcat output to see the lifecycle events being called during removal.

## Note

This project is for educational purposes and demonstrates the basic fragment lifecycle. In a real-world application, you would typically add more functionality and handle configuration changes appropriately.
