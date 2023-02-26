package components.authentication;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
// https://www.youtube.com/watch?v=fEZeZ4PIozM&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=30
public class CredentialForm { // Создаем компонент
    private AppiumDriver<MobileElement> appiumDriver;

    private final By usernameById = MobileBy.AccessibilityId("input-email");
    private final By passwordById = MobileBy.AccessibilityId("input-password");

    public CredentialForm(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public MobileElement username() {
        return appiumDriver.findElement(usernameById);
    }

    public MobileElement password() {
        return appiumDriver.findElement(passwordById);
    }

    public CredentialForm inputUsername(String usernameText) {
        this.username().sendKeys(usernameText);
        return this;
    }

    public CredentialForm inputPassword(String passwordText) {
        this.username().sendKeys(passwordText);
        return this;
    }
}
