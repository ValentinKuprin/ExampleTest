package pom;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.LoginPage;
import utils.AppiumDriverEx;

// https://www.youtube.com/watch?v=sHG46-f91Qo&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=26
public class setValueWithPom {
    public static void main(String[] args) {

        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");

        // 2. Нажать на иконку Login
        loginLabel.click();

        // 3. Ввести почту
        LoginPage loginPage = new LoginPage(appiumDriver);
        loginPage.username().sendKeys("client@yandex.ru");

        // 4. Ввести пароль
        loginPage.password().sendKeys("password");

        // 5. Нажать кнопку войти
        loginPage.loginButton().click();
    }
}
