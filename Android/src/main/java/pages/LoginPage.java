package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
// https://www.youtube.com/watch?v=sHG46-f91Qo&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=27
// https://www.youtube.com/watch?v=bmkOaiv26Eg&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=28
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

    public void inputUsername(String usernameText) {
        this.username().sendKeys(usernameText);
    }

    public MobileElement password() {
        return appiumDriver.findElement(passwordById);
    }

    public void inputPassword(String passwordText) {
        this.username().sendKeys(passwordText);
    }

    public MobileElement loginButton() {
        return appiumDriver.findElement(loginButtonById);
    }

    public void clickLoginButton() {
        this.loginButton().click();
    }
}
