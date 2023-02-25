package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.AppiumDriverEx;

public class HandleDropDown {
    public static void main(String[] args) {
        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();

        // 2. Нажать кнопку форм
        MobileElement formsLabel = appiumDriver.findElementByAccessibilityId("Forms");
        formsLabel.click();

        // 3. Нажать на кнопку выпадающего меню
        MobileElement dropDownMenuElement = appiumDriver.findElementByAccessibilityId("select-DropDown");
        dropDownMenuElement.click();

        // 4. Выбрать нужный элемент по тексту
        MobileElement firstOption = appiumDriver.findElementByXPath("//*[@text='webdriver.io is awesome']");
        firstOption.click();

        //переключение не срабатывает сделаем ожидание что бы посмотреть

        try {
            Thread.sleep(3000);
        }catch (Exception e) {}
    }
}
