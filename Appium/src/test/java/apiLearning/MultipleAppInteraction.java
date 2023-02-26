package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AppiumDriverEx;
import utils.MobileCapabilityTypeEx;

import java.time.Duration;

// https://www.youtube.com/watch?v=qfOJS82NPZw&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=27
public class MultipleAppInteraction {
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

//        //Перевести приложение в фоновый режим (сэмулировать нажатие кнопки домой на телефоне) на 5 сек, и возвращается обратно
//        appiumDriver.runAppInBackground(Duration.ofSeconds(5));

        // Если во время фонового режима нужно сделать лействия вне приложения
        appiumDriver.runAppInBackground(Duration.ofSeconds(-1));

        // Открыть настройки системы
        appiumDriver.activateApp("com.android.settings");

        // Перейти в раздел подключения WIFI
        appiumDriver.findElementByXPath("//*[@ text='Wi-Fi']").click();

        // Включить WIFI если он выключен или выключить если включен

        try {
            By wifiToggleButtonSelector = MobileBy.id("com.android.settings:id/switch_widget");
            MobileElement wifiToggleElement = appiumDriver.findElement(wifiToggleButtonSelector);

            boolean isWifiOn = wifiToggleElement.getText().equals("ON");
            if(isWifiOn) {
                // Переключить вай фай (выключить)
                wifiToggleElement.click();

                // Переключить вай фай (включить)
                WebDriverWait wait = new WebDriverWait(appiumDriver, 5);
                wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("android:id/empty"), "To see availaable"));
                wifiToggleElement.click();
            } else {
                wifiToggleElement.click();
            }
        }catch (NotFoundException notFoundException) {
            notFoundException.printStackTrace();
        }

        // Перезапустить приложение (которое мы свернули)
        appiumDriver.activateApp(MobileCapabilityTypeEx.APP_PACKAGE); //"com.wdiodemoapp"

        // Продолжить работу с приложением
        appiumDriver.findElementByXPath("//*[@text='OK']");
    }
}
