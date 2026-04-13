package HomePage;

import org.openqa.selenium.By;

public class HomePageElements {

    String URL = "https://www.automationexercise.com/";
    By HomeTab = By.xpath("//a[@style='color: orange;']");
    By LoginTab = By.xpath("//a[@href='/login']");
    By DeleteAccount = By.xpath("//a[@href='/delete_account']");
    By AccountDeleted = By.xpath("//b[text()='Account Deleted!']");
    By TestCasesTab = By.xpath("//a[@href='/test_cases']");
//    By TestCasesText = By.xpath("//span[text()='Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:']");
    By TestCasesText = By.xpath("//span[contains(text(),'Below is')]");
}
