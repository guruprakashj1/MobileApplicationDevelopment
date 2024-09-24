# SQLite Example Android Application

This Android application demonstrates how to use SQLite database in an Android app for basic CRUD (Create, Read, Update, Delete) operations. The app allows users to add new users to a database, view all users, and includes the structure for updating users.

## Table of Contents

1. [Overview](#overview)
2. [Project Structure](#project-structure)
3. [Implementation Details](#implementation-details)
4. [How to Use](#how-to-use)
5. [Key Concepts](#key-concepts)
6. [Future Enhancements](#future-enhancements)

## Overview

This application showcases:
- Creating and managing an SQLite database in Android
- Implementing basic CRUD operations
- Using RecyclerView to display database entries
- Utilizing View Binding for cleaner UI interactions

## Project Structure

The project consists of the following main components:

1. `MainActivity.kt`: The main activity handling user interactions and database operations.
2. `DatabaseHelper.kt`: A helper class for managing SQLite database operations.
3. `User.kt`: A data class representing a user entity.
4. `UserAdapter.kt`: An adapter for the RecyclerView to display user data.
5. `activity_main.xml`: The main layout file for the app's UI.
6. `user_item.xml`: The layout file for individual user items in the RecyclerView.

## Implementation Details

### MainActivity (MainActivity.kt)

This activity serves as the main entry point of the application. It handles:
- User input for adding new users
- Displaying all users in a RecyclerView
- Interactions with the DatabaseHelper for database operations

Key methods:
- `addUser()`: Adds a new user to the database
- `viewUsers()`: Retrieves all users from the database and displays them

### DatabaseHelper (DatabaseHelper.kt)

This class extends `SQLiteOpenHelper` and manages all database operations. It includes:
- Database and table creation
- Methods for adding, retrieving, and updating users

Key methods:
- `onCreate()`: Creates the database table
- `onUpgrade()`: Handles database upgrades
- `addUser()`: Inserts a new user into the database
- `getAllUsers()`: Retrieves all users from the database
- `updateUser()`: Updates an existing user in the database (structure provided, but not used in MainActivity)

### User (User.kt)

A simple data class representing a user with properties:
- `id`: Unique identifier (auto-generated)
- `name`: User's name
- `age`: User's age

### UserAdapter (UserAdapter.kt)

This adapter class is used by the RecyclerView to display user data. It:
- Inflates the layout for individual user items
- Binds user data to the views

### Layout (activity_main.xml)

The main layout includes:
- EditText fields for name and age input
- Buttons for adding and viewing users
- A RecyclerView for displaying the list of users

### User Item Layout (user_item.xml)

This layout file defines the structure for individual user items in the RecyclerView. It includes:
- A LinearLayout with horizontal orientation
- Three TextView elements to display user ID, name, and age
- Layout weights to control the relative sizes of the TextViews

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:padding="8dp"
    android:gravity="center_vertical"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <TextView
        android:id="@+id/textViewUserId"
        android:textStyle="bold"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"/>

    <TextView
        android:id="@+id/textViewUserName"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="2"/>

    <TextView
        android:id="@+id/textViewUserAge"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"/>
</LinearLayout>
```

This layout ensures that each user's information is displayed in a consistent, easy-to-read format within the RecyclerView.

## How to Use

1. Launch the application.
2. Enter a name and age in the provided EditText fields.
3. Click "Add User" to add the entered data to the database.
4. Click "View Users" to display all users stored in the database.
5. The list of users will be displayed in the RecyclerView below the buttons, with each user's ID, name, and age shown in a horizontal layout.

## Key Concepts

### SQLite in Android

SQLite is a lightweight, file-based database that comes built-in with Android. It's suitable for local data storage in mobile applications.

### ContentValues

`ContentValues` is used to store a set of values that the `ContentResolver` can process. It's utilized here to insert and update data in the SQLite database.

### RecyclerView

RecyclerView is an advanced and flexible version of ListView, used to display a scrolling list of elements based on large data sets. In this app, it's used to efficiently display the list of users.

### View Binding

View Binding is a feature that allows you to more easily write code that interacts with views, replacing `findViewById()` with generated binding objects.

### Layout Weights

In the `user_item.xml` layout, layout weights are used to distribute the available space among the TextViews. This ensures a consistent layout regardless of the content length.

## Future Enhancements

1. Implement user deletion functionality.
2. Add a feature to edit existing user information.
3. Implement search functionality to find specific users.
4. Add data validation and error handling for user input.
5. Implement database migrations for handling future schema changes.
6. Enhance the UI with custom styles and animations for the RecyclerView items.

This example provides a solid foundation for understanding SQLite usage in Android applications and can be extended to create more complex database-driven apps.
