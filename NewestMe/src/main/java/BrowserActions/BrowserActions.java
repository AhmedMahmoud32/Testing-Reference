package BrowserActions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserActions {

    WebDriver driver;

    public BrowserActions (WebDriver driver){
        this.driver = driver;
    }

    public void navigateToURL (String URL) {
        driver.get(URL);
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }
    public void scrollToElement(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(locator));
    }

    public void handleAlert(boolean accept) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        if (accept) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }


    public void hoverOnElement(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);     //Should be placed at the begining of the package
        actions.moveToElement(element).perform();
    }


}
