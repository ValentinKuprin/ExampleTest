package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

// https://www.youtube.com/watch?v=twDhFlU5Wfs&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=30
public class LoginPageMethodChaining {

    private AppiumDriver<MobileElement> appiumDriver;
    private final By usernameById = MobileBy.AccessibilityId("input-email");
    private final By passwordById = MobileBy.AccessibilityId("input-password");
    private final By loginButtonById = MobileBy.AccessibilityId("button-LOGIN");

    public LoginPageMethodChaining(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver<MobileElement> getAppiumDriver() {
        return appiumDriver;
    }

    public MobileElement username() {
        return appiumDriver.findElement(usernameById);
    }

    public LoginPageMethodChaining inputUsername(String usernameText) {
        this.username().sendKeys(usernameText);
        return  this;
    }

    public MobileElement password() {
        return appiumDriver.findElement(passwordById);
    }

    public LoginPageMethodChaining inputPassword(String passwordText) {
        this.username().sendKeys(passwordText);
        return this;
    }

    public MobileElement loginButton() {
        return appiumDriver.findElement(loginButtonById);
    }

    public void clickLoginButton() {
        this.loginButton().click();
    }
}
