package com.example.sharedpreferencesexample

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.database.MatrixCursor
import android.net.Uri

class PreferencesProvider : ContentProvider() {

    override fun onCreate(): Boolean = true

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor {
        val sharedPref = context?.getSharedPreferences("MyPrefs", android.content.Context.MODE_PRIVATE)
        val cursor = MatrixCursor(arrayOf("key", "value"))

        sharedPref?.let {
            cursor.addRow(arrayOf("username", it.getString("username", "")))
            cursor.addRow(arrayOf("darkMode", it.getBoolean("darkMode", false).toString()))
        }

        return cursor
    }

    // Implement other ContentProvider methods (insert, update, delete, getType)
    // For this example, we'll only implement the query method
    override fun insert(uri: Uri, values: ContentValues?): Uri? = null
    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int = 0
    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int = 0
    override fun getType(uri: Uri): String? = null
}
