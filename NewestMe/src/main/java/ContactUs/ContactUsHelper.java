package ContactUs;


import Assertions.Assertions;
import BrowserActions.BrowserActions;
import CommonUtilities.CommonUtilities;
import org.openqa.selenium.WebDriver;

public class ContactUsHelper extends ContactUsElements {
    WebDriver driver;
    CommonUtilities commonUtilities;
    BrowserActions browserActions;
    Assertions assertions;

    public ContactUsHelper(WebDriver driver) {
        this.driver = driver;
        browserActions = new BrowserActions(driver);
        commonUtilities = new CommonUtilities(driver);
        assertions = new Assertions(driver);
    }

    public void navigateToContactUs() {
        commonUtilities.clickElement(ContactUsTab);
    }

    public void enterName(String Name) {
        commonUtilities.enterText(NameField, Name);
    }

    public void enterEmail(String Email) {
        commonUtilities.enterText(EmailField, Email);
    }

    public void enterSubject(String Subject) {
        commonUtilities.enterText(SubjectField, Subject);
    }

    public void enterMessage(String Message) {
        commonUtilities.enterText(MessageField, Message);
    }


    public void uploadImage() {
    commonUtilities.uploadFile(UploadFile, "C:\\Ahmed Mahmoud\\HR\\New folder\\Images\\Sora.jpg");
    }



    public void clickSubmit() {
        commonUtilities.clickElement(SubmitButton);
    }

    public void scrollToSubject() {
        browserActions.scrollToElement(SubjectField);
    }
    public void assertSuccessMessage (){
        assertions.verifyTextEquals(SuccessMessage , "Success! Your details have been submitted successfully.");
    }
    public void acceptAlert (){
        commonUtilities.acceptAlert();
    }
}
