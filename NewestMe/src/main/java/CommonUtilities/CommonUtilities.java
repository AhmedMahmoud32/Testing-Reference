package CommonUtilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class CommonUtilities {

    WebDriver driver;
    Select select;

    public CommonUtilities(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator))).click();
    }

    public void enterText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }


    public void selectItem(String item) {
        select.selectByVisibleText(item);

    }

    public void selectFromDropdown(By locator, String value) {
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
        //  select.selectByIndex(3); we can select by index
    }

    public void waitUntilElementAppears(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
    }

    public void uploadFile(By locator, String FilePath) {
        driver.findElement(locator).sendKeys(FilePath);
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();   // OK
    }

    public void dismissAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();   // Cancel
    }

    public void acceptoo() {
        driver.switchTo().alert().accept();
//        handleAlert(false); // Cancel

    }
}
