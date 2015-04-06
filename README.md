# Delta Fountains App

Delta App created by JDHumphries, created in Eclipse

Delta Fountains Controls and Functions App on Android. Contains a set of pre-programmed functions to control the fountain head and a joystick that allows for manual movement. 


# Update Log

Feb. 18, 2015
 - Repository created
 - Main app added to repository
 - Preliminary Help page made
 - A list of functions were created

Feb. 19, 2015
 - Controls displays bearings
 - general commenting for easier reading
 - added background colours
 - changed help button symbol
 - changed joystick colours
 - fixed background colour of Functions activity

Feb. 23, 2015
 - updated readme 

Mar. 15, 2015
 - Created Socket Server in functions.java
 - Created Socket Server in controls.java
 - Removed test button and text field in activity_main.xml
 - Fixed error in functions.java

Mar. 21, 2015
 - Functions.java connects and sends data to the server
 - Added test server file; EchoServer.java
 - Controls.java connects and sends data to the server
 - Added onDestroy to close socket without crashing server

Mar. 23, 2015
 - Added Android Studio version of the project

Mar. 26, 2015
 - Eclipse version doesn't crash when closing activities
 - After some syncing errors, the Android Studio version is up and doesn't scrash when closing activities

Apr. 1, 2015
 - Settings..java added for modifying the IP Address and Port Number
 - Activities won't start unless they can connect to the server. This is a temporary fix for crashing

Apr. 4, 2015
 - Changed value sent to server from joystick
 - Added timeout to activities that connect to the socket server
 - Changed project name and brouguht Android Studio version up to speed

Apr. 6, 2015
 - Changed colour of Settings.java
 - East is not spelled "Eest"
 - Added Landscape mode for the main and controls xml files
