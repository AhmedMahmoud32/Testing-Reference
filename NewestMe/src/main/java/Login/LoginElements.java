package Login;

import org.openqa.selenium.By;

public class LoginElements {

    By LoginEmail = By.xpath("//input[@data-qa='login-email']");
    By LoginPassword = By.xpath("//input[@data-qa='login-password']");
    By LoginButton = By.xpath("//button[@data-qa='login-button']");
    By ErrorMessage = By.xpath("//p[text()='Your email or password is incorrect!']");

}
