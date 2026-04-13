package Login;

import Assertions.Assertions;
import BrowserActions.BrowserActions;
import CommonUtilities.CommonUtilities;
import org.openqa.selenium.WebDriver;

public class LoginHelper extends LoginElements {

    WebDriver driver;
    BrowserActions browserActions;
    CommonUtilities commonUtilities;
    Assertions assertions;

    public LoginHelper(WebDriver driver) {
        this.driver = driver;
        browserActions = new BrowserActions(driver);
        commonUtilities = new CommonUtilities(driver);
        assertions = new Assertions(driver);
    }

    public void enterLoginData (String email, String password){
        commonUtilities.enterText(LoginEmail, email);
        commonUtilities.enterText(LoginPassword, password);
        commonUtilities.clickElement(LoginButton);
    }
    public void verifyErrorMessage (){
        assertions.verifyTextEquals(ErrorMessage, "Your email or password is incorrect!");
    }
}
