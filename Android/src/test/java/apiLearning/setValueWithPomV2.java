package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.LoginPage;
import utils.AppiumDriverEx;

// https://www.youtube.com/watch?v=bmkOaiv26Eg&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=28
public class setValueWithPomV2 {
    public static void main(String[] args) {

        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");

        // 2. Нажать на иконку Login
        loginLabel.click();

        // 3. Ввести почту
        LoginPage loginPage = new LoginPage(appiumDriver);
        loginPage.inputUsername("client@yandex.ru");

        // 4. Ввести пароль
        loginPage.inputPassword("password");

        // 5. Нажать кнопку войти
        loginPage.clickLoginButton();
    }
}
