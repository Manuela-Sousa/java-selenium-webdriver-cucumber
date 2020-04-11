package test.definitions.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class WebDriverFactory {

    //hashmap used to define drivers
    private static final HashMap<DriverType, WebDriver> driverMap = new HashMap<DriverType, WebDriver>();

    static {
        driverMap.put(DriverType.CHROME, getChromeDriver());
        driverMap.put(DriverType.FIREFOX, getFirefoxDriver());
    }

    //garantees only one instance of driver is used
    public static WebDriver driver = getDriver(DriverType.CHROME);
    public static WebDriverWait wait = getWebDriverWait(driver);


    private WebDriverFactory() {
        // Declaring constructor as private to restrict object creation outside of class
    }

    private static WebDriver getChromeDriver() {

        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\manue\\java-selenium-webdriver-cucumber-sample-framework\\src\\test\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    private static WebDriver getFirefoxDriver() {
        if (driver == null) {
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\manue\\java-selenium-webdriver-cucumber-sample-framework\\src\\test\\resources\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
    }


    private static WebDriver getDriver(DriverType driver) {
        return driverMap.get(driver);
    }

    private static WebDriverWait getWebDriverWait(WebDriver driver) {
        if (wait == null) {
            return new WebDriverWait(driver, 30);
        }
        return wait;
    }
}
