package test.definitions.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

import static test.definitions.factory.WebDriverFactory.driver;

public class BaseClass {

    @Before
    public void startUpBrowser() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        driver.close();
    }
}
