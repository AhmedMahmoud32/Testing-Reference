package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Assertions {

    static WebDriver driver;

    public Assertions(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyElementIsDisplayed(By locator) {
        Assert.assertTrue(driver.findElement(locator).isDisplayed(), "Locator" + locator + " does not appears ");
    //This error message String appears when element not found
    }

    public void verifyTextEquals(By locator, String expectedText) {
        String actualText = driver.findElement(locator).getText();
        Assert.assertEquals(actualText, expectedText, "Expected text to contain: " + expectedText + " but the text was " + actualText);
    }

    public void assertTextContains(By locator, String expectedText) {
        String actualText = driver.findElement(locator).getText();
        Assert.assertTrue(actualText.contains(expectedText), "Expected text to contain: " + expectedText + " but the text was " + actualText);
    }

}
