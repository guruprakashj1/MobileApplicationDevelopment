# Student Bio Data Form

This Android app demonstrates a student bio data form with various UI elements and displays the submitted data on another page.

## Features

- Input fields for name and age
- Radio buttons for gender selection
- Spinner (dropdown) for selecting a major
- Checkboxes for selecting hobbies
- Submit button to send data to a result page
- Result page displaying all submitted information

## Code Structure

- `MainActivity.kt`: Handles the main form UI and data collection
- `ResultActivity.kt`: Displays the submitted data
- `activity_main.xml`: Layout for the main form
- `activity_result.xml`: Layout for the result page
- `strings.xml`: Contains all string resources used in the app

## How it works

1. The app opens with a form containing various input fields.
2. Users fill out their information:
   - Name (EditText)
   - Age (EditText)
   - Gender (RadioButtons)
   - Major (Spinner)
   - Hobbies (CheckBoxes)
3. Upon clicking the submit button, the app collects all the input data.
4. The data is then passed to the ResultActivity using an Intent.
5. ResultActivity displays all the submitted information.

## Implementation Details

- EditText is used for text input (name and age)
- RadioGroup and RadioButtons are used for gender selection
- Spinner is used for major selection, populated from a string array resource
- CheckBoxes are used for hobby selection
- Intent is used to pass data between activities
- ScrollView is used in both activities to ensure all content is accessible on smaller screens

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on an emulator or physical device

## Requirements

- Android Studio 4.0+
- Kotlin 1.5+
- Android SDK 21+

