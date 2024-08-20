# Lecture Prompt: Android Intents

## I. Introduction to Intents
A. Definition of Intents
   - Messaging objects used to request an action from another app component
   - Key mechanism for inter-component communication in Android

B. Basic structure of an Intent
   - Action
   - Data
   - Category
   - Extras

## II. Types of Intents

### A. Explicit Intents
1. Definition: Specifies the exact component to start by name
2. Use cases: Starting a specific activity or service within your app
3. Example code snippet:
   ```kotlin
   val intent = Intent(this, SecondActivity::class.java)
   startActivity(intent)
   ```

### B. Implicit Intents
1. Definition: Declares a general action to perform, allowing the system to find a suitable component
2. Use cases: Sharing content, opening a web page, sending an email
3. Example code snippet:
   ```kotlin
   val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
   startActivity(intent)
   ```

## III. Internal Intents

A. Definition: 
Intents used within the same application

B. Common uses:
   1. Navigation between activities
   2. Starting services
   3. Sending broadcasts within the app

C. Benefits: 
   - Direct communication
   - Type safety when using explicit intents

D. Example: Passing data between activities
   ```kotlin
   val intent = Intent(this, DetailActivity::class.java)
   intent.putExtra("item_id", itemId)
   startActivity(intent)
   ```

## IV. External Intents

A. Definition: Intents that interact with components of other applications

B. Use cases:
   1. Opening a web browser
   2. Sharing content to social media
   3. Picking a contact from the address book

C. Security considerations:
   - Potential for data leakage
   - Importance of careful intent construction

D. Example: Sharing text content
   ```kotlin
   val shareIntent = Intent().apply {
       action = Intent.ACTION_SEND
       type = "text/plain"
       putExtra(Intent.EXTRA_TEXT, "Check out this cool app!")
   }
   startActivity(Intent.createChooser(shareIntent, "Share via"))
   ```

## V. Pending Intents

A. Definition: A wrapper around a regular intent that specifies an action to be performed in the future

B. Key characteristics:
   1. Can be handed to other applications
   2. Allows the other app to perform the specified action as if it were your application

C. Common uses:
   1. Notifications
   2. App widgets
   3. AlarmManager operations

D. Security implications:
   - Granting permissions to other applications

E. Example: Creating a PendingIntent for a notification
   ```kotlin
   val intent = Intent(this, NotificationActivity::class.java)
   val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
   ```

## VI. Intent Filters

A. Definition: Declarations in the app's manifest file that specify the types of intents an activity, service, or broadcast receiver can respond to

B. Purpose: Allow Android components to be reusable and interchangeable

C. Key elements:
   1. '<action>
   2. '<category>
   3. '<data>

D. Example manifest entry:
   ```xml
   <activity android:name=".ShareActivity">
       <intent-filter>
           <action android:name="android.intent.action.SEND"/>
           <category android:name="android.intent.category.DEFAULT"/>
           <data android:mimeType="text/plain"/>
       </intent-filter>
   </activity>
   ```

## VII. Best Practices and Considerations

A. Security
   1. Validate incoming intents
   2. Use explicit intents when possible
   3. Be cautious with exported components

B. Performance
   1. Avoid overuse of broadcast intents
   2. Use LocalBroadcastManager for internal communication

C. User Experience
   1. Provide clear intent filters to appear in appropriate share menus
   2. Handle cases where no app can resolve an intent

## VIII. Hands-on Exercise

A. Create a simple app demonstrating:
   1. An explicit intent to navigate between activities
   2. An implicit intent to share content
   3. A pending intent used in a notification
   4. An activity with an intent filter to receive shared text

## IX. Conclusion

A. Recap of key points
B. Importance of intents in Android app architecture
C. Encourage further exploration and practice

