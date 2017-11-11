# White Papers

I've created below TestNG Test:

- Open the website http://www.thebioagency.com/news-and-views/white-papers/
- Open first white paper
- Scroll 3 times to the right
- Fill the form and submit
- Assert form has been successfully submitted.

### Prerequisites
- Language - Java 1.8
- Automation Tool - Selenium Webdriver 2.53.1
- Test Framework - TestNG
- Build Tool - Maven
- IDE - Intellij Idea Tool

### Tested on below browsers 

#### Mac

```
FF - 47.0.1
Chrome - 61.0

```


Note - I've uploaded the chrome drivers kept at src/test/resources/chromeDrivers/chromedriver.
- If you run the tests on windows, it'll pick up chromeDriver.exe
- If you run the tests on mac, it'll pick up chromeDriver

At present config.properties file contains chrome driver so it'll run the tests on chrome. If you want to
run the tests on FF, change the browser value to "firefox".

### Execution Steps

- Clone the repository or download project as a zip file
- Download all the required libraries
- Run the tests by right click on the TestNG test in IntelliJ or Eclipse

OR

- Run the test using below maven command

```
 mvn clean verify

```


