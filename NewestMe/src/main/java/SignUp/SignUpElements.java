package SignUp;

import org.openqa.selenium.By;

public class SignUpElements {

    By HomePage = By.xpath("//i[@class='fa fa-home']");
    By Title = By.xpath("//input[@name='title' and@value='Mr']");
    // WANNA MAKE IT DOLLAR SIGN

    By Name = By.xpath("//input[@data-qa='signup-name']");
    By EmailAdress = By.xpath("//input[@data-qa='signup-email']");
    By SignUpButton = By.xpath("//button[@data-qa='signup-button']");
    By Password = By.xpath("//input[@data-qa='password']");
    By DayOfBirth = By.xpath("//select[@id='days']");
 //   By SelectedDay = By.xpath(String.format("//select[@id='days']//option[@value='%s']", day));

    By MonthOfBirth = By.xpath("//select[@id='months']");
    By YearOfBirth = By.xpath("//select[@id='years']");


    By FirstName = By.xpath("//input[@data-qa='first_name']");
    By LastName = By.xpath("//input[@data-qa='last_name']");
    By Company = By.xpath("//input[@data-qa='company']");
    By Address = By.xpath("//input[@id='address1']");
    By Country = By.xpath("//select[@data-qa='country']");
    By SelectedCountry = By.xpath("//option[@value='India']");
  //  By SelectedCountry = By.xpath("//option[@value='India']"); SAMW AS SELECTED DAY

    By State = By.xpath("//input[@id='state']");
    By City = By.xpath("//input[@id='city']");
    By ZipCode = By.xpath("//input[@id='zipcode']");
    By MobileNumber = By.xpath("//input[@id='mobile_number']");
    By CreateAccount = By.xpath("//button[@data-qa='create-account']");
    By AccountCreatedMessage = By.xpath("//b[text()='Account Created!']");
    By ContinueButton = By.xpath("//a[@data-qa='continue-button']");

    By LogoutButton = By.xpath("//a[@href='/logout']");
}
