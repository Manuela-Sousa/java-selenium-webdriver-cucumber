package test.definitions.actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static test.definitions.factory.WebDriverFactory.driver;
import static test.definitions.factory.WebDriverFactory.wait;

public class SharedActions {

    public static SharedActions getSharedActions() {
        return new SharedActions();
    }


    public void verifyIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
    }


    public void clickOnElement(By element) {
        WebElement element_click = wait.until(
                ExpectedConditions.visibilityOfElementLocated(element));
        element_click.click();

    }

    public void search(String value, By element) {
        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(element));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);

    }
    
    public void insertKeys(String value, By element){
        WebElement text_element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(element));
        text_element.sendKeys(value);

    }
}
