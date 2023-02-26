package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPage {

//    LoginPage loginPage = new LoginPage(appiumDriver);
//    loginPage.username().sendKeys("username");


    private AppiumDriver<MobileElement> appiumDriver;
    private final By usernameById = MobileBy.AccessibilityId("input-email");
    private final By passwordById = MobileBy.AccessibilityId("input-password");
    private final By loginButtonById = MobileBy.AccessibilityId("button-LOGIN");

    public  LoginPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver<MobileElement> getAppiumDriver() {
        return appiumDriver;
    }

    public MobileElement username() {
        return appiumDriver.findElement(usernameById);
    }

    public MobileElement password() {
        return appiumDriver.findElement(passwordById);
    }

    public MobileElement loginButton() {
        return appiumDriver.findElement(loginButtonById);
    }
}
