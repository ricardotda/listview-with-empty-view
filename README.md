ListView with empty view
=

The objective of this project is to show how to implement an empty view in a ListActivity in Android.

This project is based in the official Android documentation for ListViewActivity, available [here]
(http://developer.android.com/reference/android/app/ListActivity.html).

Theoretical Background
-

ListActivity hosts a ListView object that can be bound to different data sources, typically either an array or a Cursor holding query results.

By default, ListActivity has a layout that consists of a single, full-screen list in the center of the screen. 
However, this screen layout can be customized by setting a custom view layout with setContentView() in onCreate(). 
To do this, the custom view must contain a ListView object with the id "@android:id/list" (or list if it's in code)

Optionally, the custom view can contain another view object of any type to display when the list view is empty. 
This "empty list" notifier must have an id "android:id/empty".

Project
-

The custom layout used in this project is divided into two parts, the first one consists of two buttons, for setting 
and cleaning the list, the second part of the layout shows a ListView or a TextView (empy view) in accordance with the actions performed by the buttons. After set the list it will be show a ListView containing the names of all Android versions until the KitKat.