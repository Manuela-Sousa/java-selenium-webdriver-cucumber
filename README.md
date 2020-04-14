# Sample project to use Selenium Webdriver tests with Cucumber and Java


# Organization of the project

```bash
This repository is organized into different folders:
*Actions
*Factory
*Page Objects
*Step Definitions
*Utils
```

```bash
*The Actions folder contains specific methods that perform actions related with different features.
*The Factory folder contains all the information related with browsers and the drivers necessary for the project to run and interact with the browsers.
*The PageObjects folder contains the web elements with their respective locators.
*The StepDefinitions folder contains the steps of each cucumber specification linked to the implementation code.
*The Utils folder contains the BaseClass that centralizes some generalized actions to interact with the browser.
```

# Design Patterns used in this project and their explanation

# Factory Pattern 
```bash
Factory pattern create objects based on browser type and it is applied to this project through the DriverFactory class. The DriverFactory class has the method getDriver, that returns different drivers based on the DriverType enum, that holds different browser types. Test classes should not be worried about how the drivers used in tests are created. So, Factory Pattern hides from the other classes how drivers are being created. If is needed to change something about the drivers it only be changed in one place DriverFactory class.
```

# Singleton Pattern
```bash
Singleton Pattern is used to have only one instance of the web driver in use across all the tests of the project and it is applied to this project through the DriverFactory class. The DriverFactory class has private constructor, a private static instance of the web driver with return type to check if class is already instantiated once.
```

# Page Object Pattern
```bash
Page Object Pattern is used to improve test automation maintenance and reducing code duplication and it is applied to this project in page_objects folder. The classes inside page_objects folder represent the locators for web elements of each different page from the website used for tests and their separation from tests that are in resources folder.  
The custom Page Object Pattern says that actions associate with features and with page objects should also be in this classes along with locators. Due to the violation of Single Reponsability Principle that states that classes can only have one reason to change, regarding the SOLID principles of object oriented programming language, in this project each group of actions associated with the features and with page objects of each page, are in a new class in actions folder.
```

