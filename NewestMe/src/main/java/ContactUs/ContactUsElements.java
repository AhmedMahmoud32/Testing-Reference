package ContactUs;

import org.openqa.selenium.By;

public class ContactUsElements {

    By ContactUsTab = By.xpath("//a[@href='/contact_us']");
    By NameField = By.xpath("//input[@name='name']");
    By EmailField = By.xpath("//input[@name='email']");
    By SubjectField = By.xpath("//input[@name='subject']");
    By MessageField = By.xpath("//textarea[@name='message']");
    By UploadFile = By.name("upload_file");
    By SubmitButton = By.xpath("//input[@name='submit']");
    By SuccessMessage = By.xpath("//div[@class='status alert alert-success']");


}
