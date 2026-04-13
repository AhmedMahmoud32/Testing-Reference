package HomePage;

import Assertions.Assertions;
import BrowserActions.BrowserActions;
import CommonUtilities.CommonUtilities;
import org.openqa.selenium.WebDriver;


public class HomePageHelper extends HomePageElements {

    WebDriver driver;
    CommonUtilities commonUtilities;
    BrowserActions browserActions;
    Assertions assertions;

  public HomePageHelper (WebDriver driver){
     this.driver =driver;
     commonUtilities = new CommonUtilities(driver);
     browserActions = new BrowserActions(driver);
     assertions = new Assertions(driver);
  }



    public void openURL() {
        browserActions.navigateToURL(URL);
    }
    public void navigateToHomePage() {
    commonUtilities.clickElement(HomeTab);
    }

    public void navigateToLoginPage() {
    commonUtilities.clickElement(LoginTab);
    }
    public void navigateToTestCasesPage (){
      commonUtilities.clickElement(TestCasesTab);
    }
    public void deleteAccount (){
      commonUtilities.clickElement(DeleteAccount);
    }
    public void verifyAccountDeleted (){
      assertions.verifyTextEquals(AccountDeleted, "ACCOUNT DELETED!");
    }
    public void verifyTestCasesText (){
      assertions.assertTextContains(TestCasesText, "Below is");
    }
}
