package SignUp;

import Assertions.Assertions;
import BrowserActions.BrowserActions;
import CommonUtilities.CommonUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpHelper extends SignUpElements {
    WebDriver driver;
    BrowserActions browserActions;
    CommonUtilities commonUtilities;
    Assertions assertions;

    public SignUpHelper(WebDriver driver) {
        this.driver = driver;
        browserActions = new BrowserActions(driver);
        commonUtilities = new CommonUtilities(driver);
        assertions = new Assertions(driver);
    }

   public void navigateToHomePage (){
   commonUtilities.clickElement(HomePage);
   }

    public void NewUserSignUp(String name, String email, String password) {
        commonUtilities.enterText(Name, name);
        commonUtilities.enterText(EmailAdress, email);
        commonUtilities.clickElement(SignUpButton);
        commonUtilities.enterText(Password, password);
    }

    public void selectTitle() {
        commonUtilities.clickElement(Title);

    }

    public void enterFirstAndLastName(String FName, String LName) {
        commonUtilities.enterText(FirstName, FName);
        commonUtilities.enterText(LastName, LName);
    }

    public void enterCompany(String ComapnyName) {
        commonUtilities.enterText(Company, ComapnyName);
    }

    public void enterAddress(String AddressName) {
        commonUtilities.enterText(Address, AddressName);
    }

//   public void SelectDateOfBirth (By locator , String item){
//       commonUtilities.selectFromDropdown(DayOfBirth, "18");


//    public void selectDayOfBirth(String item){
//       commonUtilities.clickElement(DayOfBirth);
//       commonUtilities.selectItem(item);
//    }

    public void selectDateOfBirth(String day, String month, String year) {
        commonUtilities.selectFromDropdown(DayOfBirth, day);
        commonUtilities.selectFromDropdown(MonthOfBirth, month);
        commonUtilities.selectFromDropdown(YearOfBirth, year);

    }


    public void selectCountry(String country) {
        commonUtilities.selectFromDropdown(Country, country);
    }

    public void enterState(String state) {
        commonUtilities.enterText(State, state);
    }

    public void enterCity(String city) {
        commonUtilities.enterText(City, city);
    }

    public void enterZipCode(String zipCode) {
        commonUtilities.enterText(ZipCode, zipCode);
    }

    public void enterMobileNumber(String mobileNumber) {
        commonUtilities.enterText(MobileNumber, mobileNumber);
    }

    public void clickCreateAccount() {
        commonUtilities.clickElement(CreateAccount);
    }

    public void scrollToDateOfBirth() {
        browserActions.scrollToElement(DayOfBirth);
    }

    public void scrollToAddress() {
        browserActions.scrollToElement(Address);

    }

    public void scrollToCity() {
        browserActions.scrollToElement(City);
    }

    public void verifyAccountCreated() {
        assertions.verifyTextEquals(AccountCreatedMessage, "ACCOUNT CREATED!");
    }

    public void clickContinueButton() {
        commonUtilities.clickElement(ContinueButton);
    }
    public void logout(){

        commonUtilities.clickElement(LogoutButton);
    }
}
