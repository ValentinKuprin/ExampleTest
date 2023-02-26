package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.AppiumDriverEx;

import java.time.Duration;
//https://www.youtube.com/watch?v=qQfW4WZdPXw&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=25
public class PutAppInBackground {
    public static void main(String[] args) {

        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();

        // 2. Нажать на иконку Login
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
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

        //Перевести приложение в фоновый режим (сэмулировать нажатие кнопки домой на телефоне) на 5 сек, и возвращается обратно
        appiumDriver.runAppInBackground(Duration.ofSeconds(5));

//        // Если во время фонового режима нужно сделать лействия вне приложения
//        appiumDriver.runAppInBackground(Duration.ofSeconds(-1));
    }
}
