## Create the Count App

# Initial Project Setup
1. Create a new android application project.
2. Enter the project details (like: application_name, package_name, minimum_supported_version, etc.).
3. Select the type of activity on the next screen as `Empty Activity` and keep the default name.

# Application Code
1. LAYOUT FILE (XML):
    app -> src -> main -> res -> layout -> `activity_main.xml`
 * Add the TextView and Buttons

2. ACTIVITY CLASS FILE (JAVA):
    app -> src -> main -> java -> <package-name> -> `MainActivity.java`

 * STEP-1: Declare view variables globaly and BindViews from the xml
 * STEP-2: Declare a variable `mCount` and initialize it to `0`
 * STEP-3: Setup clicks on the buttons to increment / decrement the value of count variable
 * STEP-4: Display the updated value of the `mCount` variable in the TextView
