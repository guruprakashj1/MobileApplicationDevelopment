

Layout (activity_main.xml):

We're using a simple LinearLayout for a straightforward vertical arrangement of views.
It includes an EditText for content, another for the file name, a save button, and a ListView for displaying saved files.


MainActivity.kt:

We're using a standard ArrayAdapter with ListView instead of RecyclerView for simplicity.
The file operations (save, list, read) are implemented in separate methods for clarity.



Key Points:

Saving Files:

The saveFile function writes the content to a file with the given name (appending .txt).
It uses openFileOutput which automatically saves to the app's internal storage.


Listing Files:

The updateFileList function uses fileList() to get all files in internal storage, then filters for .txt files.
It updates the ArrayAdapter, which automatically updates the ListView.


Reading Files:

The showFileContent function reads the content of a selected file and displays it in an AlertDialog.


User Interaction:

Files are saved when the user enters content, a file name, and taps the "Save File" button.
The file list updates immediately after saving.
Users can tap on a file name in the list to view its contents.