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
*The folder of Actions contains specific methods that perform actions related with different features.
*The folder of Factory contains all the information related with browsers and the drivers necessary to the project run.
*The folder of Page Objects contains the web elements with their identifiers.
*The folder of Step Definitions contains the steps of each cucumber specification linked to the implementation code.
*The folder of Utils contains the BaseClass that centralizes some generalized actions to interact with the browser.
```

# Design Patterns used in this project and their explanation

# Factory Pattern 
```bash
Factory pattern create objects based on browser type and it is applied to this project through the DriverFactory class. The DriverFactory class has the method getDriver, that returns different drivers based on the DriverType enum, that holds different browser types. Test classes should not be worried about how the drivers used in tests are created. So, Factory Pattern hides from the other classes how drivers are being created. If is needed to change something about the drivers it only be changed in one place DriverFactory class.
```
