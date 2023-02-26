package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.AppiumDriverEx;
//https://www.youtube.com/watch?v=HfzDcKabbVA&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=17
public class HandleToggleButton {
    public static void main(String[] args) {
        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();

        // 2. Нажать кнопку форм
        MobileElement formsLabel = appiumDriver.findElementByAccessibilityId("Forms");
        formsLabel.click();

        // 3. Получить состояние тогла (переключателя)
        MobileElement switchTextElement = appiumDriver.findElementByAccessibilityId("switch-text");
        System.out.println("Состояние переключателя ПЕРЕД нажатием на него " + switchTextElement.getText());

        // 4. Нажать переключатель (toggle)
        MobileElement switchElement = appiumDriver.findElementByAccessibilityId("switch");
        switchElement.click();
        System.out.println("Состояние переключателя ПОСЛЕ нажатием на него " + switchTextElement.getText());
    }
}
