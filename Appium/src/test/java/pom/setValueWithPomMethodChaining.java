package pom;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.LoginPage;
import pages.LoginPageMethodChaining;
import utils.AppiumDriverEx;

// https://www.youtube.com/watch?v=twDhFlU5Wfs&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=30
public class setValueWithPomMethodChaining {
    public static void main(String[] args) {

        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");

        // 2. Нажать на иконку Login
        loginLabel.click();

        // 3. Ввести дести данные для входа и нажать кнопку Login
        LoginPageMethodChaining loginPage = new LoginPageMethodChaining(appiumDriver);
        loginPage
                .inputUsername("client@yandex.ru")
                .inputPassword("password")
                .clickLoginButton();
    }
}
