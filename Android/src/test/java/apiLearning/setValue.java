package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.AppiumDriverEx;

//https://www.youtube.com/watch?v=YecsinHl88A&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=11
public class setValue {
    public static void main(String[] args) {

        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
        // 2. Нажать на иконку Login
        loginLabel.click();
        // 3. Ввести почту
        MobileElement emailTxtBx = appiumDriver.findElementByAccessibilityId("input-email");//content-desc
        emailTxtBx.sendKeys("client@yandex.ru");
        // 4. Ввести пароль
        MobileElement passwordTxtBx = appiumDriver.findElementByAccessibilityId("input-password");
        passwordTxtBx.sendKeys("password");
        // 5. Нажать кнопку войти
        MobileElement loginButton = appiumDriver.findElementByAccessibilityId("button-LOGIN");
        loginButton.click();
    }
}
