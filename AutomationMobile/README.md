# TAE Academy - Mobile module - base framework
Base framework to be used in the exercises delivered in the TAE Academy

#Prerequisites
To be able to run this project locally you will need to have the following apps installed.
* Android studio
* Java / SDK 8 or higher
* Appium
* maven (optional)

# Setup
In order to run this project locally you'll need to change the file `src/test/resources/mobile_capabilities.json` to use the capabilities that match you local setup.
You might wat to modify mainly `platformVersion` and `app`, the other capabilities can be left untouched

# Run the included example
The framework includes a basic testNG XML file to run a single suite.
In order to see the script in execution you need to run the file `src/test/resources/SuiteTest.xml` whether with the IDE testNG plugin or via Maven.

## Using the IDE plugin
Right click the XML file and select the option "Run"

## Using maven
Open a new terminal/command line window and execute this command `mvn test`

# Modifying the framework to implement your own scripts
The first step is to modify the capabilities in accordance with the app to be tested in the file `src/test/resources/mobile_capabilities.json`
* `app` Path to the local *APK* file to be used
* `appPackage` Application's package name.
* `appActivity` Application's activity.

To start coding, we recommend organizing your new java classes as follows:
* `src/test/java/screens` the classes that represent the ***Pages*** in your scripts
* `src/test/java/tests` the classes that represent the ***Test cases***

