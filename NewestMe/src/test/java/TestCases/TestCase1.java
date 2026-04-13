package TestCases;

import CommonUtilities.CommonUtilities;
import ContactUs.ContactUsHelper;
import DriverManager.DriverManager;
import HomePage.HomePageHelper;
import Login.LoginHelper;
import Products.ProductsHelper;
import SignUp.SignUpHelper;
import TestBase.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends TestBase {

    WebDriver driver;
    HomePageHelper homePageHelper;
    SignUpHelper signUpHelper;
    LoginHelper loginHelper;
    ContactUsHelper contactUsHelper;
    ProductsHelper productsHelper;
    Faker faker;

    //Variables
    String generatedName;
    String generatedEmail;
    String generatedPassword;

    @BeforeMethod
    public void setup() {
        DriverManager driverManager = new DriverManager();
        driver = driverManager.initiateDriver();
        homePageHelper = new HomePageHelper(driver); // Should be here or in @test ?
        signUpHelper = new SignUpHelper(driver);
        loginHelper = new LoginHelper(driver);
        contactUsHelper = new ContactUsHelper(driver);
        productsHelper = new ProductsHelper(driver);
        faker = new Faker();
    }


    @Test
    public void signUp() {

        homePageHelper.openURL();
        homePageHelper.navigateToLoginPage();

        generatedName = faker.leagueOfLegends().champion();
        generatedEmail = faker.internet().emailAddress();
        generatedPassword = faker.internet().password();

        // signUpHelper.NewUserSignUp(faker.leagueOfLegends().champion(), faker.internet().emailAddress(), faker.internet().password());
        signUpHelper.NewUserSignUp(generatedName, generatedEmail, generatedPassword);
        signUpHelper.selectTitle();
        signUpHelper.scrollToDateOfBirth();

        signUpHelper.selectDateOfBirth("18", "1", "2000");

        signUpHelper.enterFirstAndLastName("Adham", "Sabry");
        signUpHelper.enterCompany("Sherka");
        signUpHelper.scrollToAddress();
        signUpHelper.enterAddress("3enwan");
        signUpHelper.selectCountry("Canada");
        signUpHelper.enterState("Nasr City");
        signUpHelper.scrollToCity();
        signUpHelper.enterCity("Gardenia");
        signUpHelper.enterZipCode("150200");
        signUpHelper.enterMobileNumber(faker.phoneNumber().cellPhone());
        signUpHelper.clickCreateAccount();
        signUpHelper.verifyAccountCreated();
        signUpHelper.clickContinueButton();


        signUpHelper.logout();

        loginHelper.enterLoginData(generatedEmail, generatedPassword);


        // signUpHelper.navigateToHomePage();

    }


    @Test
    public void loginWithCorrectData() {
        homePageHelper.openURL();
        homePageHelper.navigateToLoginPage();
        loginHelper.enterLoginData(generatedEmail, generatedPassword);
    }

    @Test
    public void loginWithIncorrectData() {
        homePageHelper.openURL();
        homePageHelper.navigateToHomePage();
        homePageHelper.navigateToLoginPage();
        loginHelper.enterLoginData(faker.internet().emailAddress(), faker.internet().password());
        loginHelper.verifyErrorMessage();
    }

    @Test
    public void deleteAccount() {
        homePageHelper.deleteAccount();
        homePageHelper.verifyAccountDeleted();
    }

    @Test
    public void contactUsForm() {
        homePageHelper.openURL();
        contactUsHelper.navigateToContactUs();
        contactUsHelper.enterName(faker.leagueOfLegends().champion());
        contactUsHelper.enterEmail(faker.internet().emailAddress());
        contactUsHelper.enterSubject("NewSubject");
        contactUsHelper.scrollToSubject();
        contactUsHelper.enterMessage("New Message");
        contactUsHelper.uploadImage();
        contactUsHelper.clickSubmit();
        contactUsHelper.acceptAlert();
        contactUsHelper.assertSuccessMessage();
    }
    @Test
    public void verifyTestCasesPage (){
        homePageHelper.openURL();
        homePageHelper.navigateToTestCasesPage();
        homePageHelper.verifyTestCasesText();
    }
    @Test
    public void searchForProduct (){
        homePageHelper.openURL();
        productsHelper.navigateToProductsPage();
        productsHelper.searchItem("Jeans");
        productsHelper.scrollDown();
        productsHelper.hoverOnFirstProduct();

    }

}
