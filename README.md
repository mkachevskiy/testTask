# Home task for a company

# Info
The project contains UI tests for verify skill set on the web site.

# Setup
1. Open the project in IDE
2. Install Maven https://maven.apache.org/install.html
3. Open pom.xml and reload all Maven projects

# Run tests
Run tests by running console command 'mvn clean test'.

You can also run tests from IDE by clicking on run button near test method or test class.

# Structure description
Test is based on Java + Maven + Selenium + Junit 5 + Webdrivermanager. 
Test will be run in Google Chrome browser.
Page object pattern + Page Factory pattern are used for the project.
All tests can be found in /src/test/java/ru.ctco.
All pages classes can be found in /src/main/java/ru.ctco.pages.
