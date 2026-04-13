package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DriverManager {

    WebDriver driver;

    public WebDriver initiateDriver() {


        ChromeOptions options = new ChromeOptions();

        Path tempProfile = null;
        try {
            tempProfile = Files.createTempDirectory("chrome-profile");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Disable autofill completely
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("autofill.profile_enabled", false);
        prefs.put("autofill.address_enabled", false);
        prefs.put("autofill.credit_card_enabled", false);
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.addArguments("--user-data-dir=" + tempProfile.toString());
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");

        driver = new ChromeDriver(options);
        return driver;
    }

}
