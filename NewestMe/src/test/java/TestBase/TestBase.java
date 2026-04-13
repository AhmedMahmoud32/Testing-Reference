package TestBase;

import DriverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver;

@BeforeMethod

    public void setup (){
    DriverManager driverManager = new DriverManager();
    driver = driverManager.initiateDriver();
}

//@AfterMethod
//    public void quit (){
//    driver.quit();
//}

}
