package pages;

import components.authentication.CredentialForm;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

// https://www.youtube.com/watch?v=fEZeZ4PIozM&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=30
public class LoginPageWithComponents {

    private AppiumDriver<MobileElement> appiumDriver;
    private CredentialForm credentialForm; // свойство компонента
    private final By loginButtonById = MobileBy.AccessibilityId("button-LOGIN");

    public LoginPageWithComponents(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
        credentialForm = new CredentialForm(appiumDriver); //создаем новый экземпляр компонента
    }

    public MobileElement loginButton() {
        return appiumDriver.findElement(loginButtonById);
    }

    public void clickLoginButton() {
        this.loginButton().click();
    }

    public CredentialForm credentialForm() {
        return this.credentialForm; //TODO: зачем, для чего?
    }
}
