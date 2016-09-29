cd acceptance
javac -cp .;..\build\classes\main Main.java
java -cp .;..\build\classes\main;C:\RobotFramework\robotframework-3.0.jar org.robotframework.RobotFramework CustomWidgetTests.txt
cd ..