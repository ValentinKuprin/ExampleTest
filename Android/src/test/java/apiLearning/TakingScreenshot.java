package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.AppiumDriverEx;

import java.io.File;
import java.io.IOException;
//https://www.youtube.com/watch?v=-imxe06IBr8&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=19
public class TakingScreenshot {
    public static void main(String[] args) {

        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();

        // 2. Нажать кнопку форм
        MobileElement formsLabel = appiumDriver.findElementByAccessibilityId("Forms");
        formsLabel.click();

        // 3. Нажать на переключатель если он Выключен
        MobileElement switchElement = appiumDriver.findElementByAccessibilityId("switch");
        MobileElement switchTextElement = appiumDriver.findElementByAccessibilityId("switch-text");
        final boolean isSwitchOn = switchTextElement.getText().equals("Click to turn the switch OFF");

        if(!isSwitchOn) {
            switchElement.click();
        }

        //4 Нажать на кнопку выпадающего меню
        MobileElement dropDownMenuElement = appiumDriver.findElementByAccessibilityId("select-DropDown");
        dropDownMenuElement.click();

        // 5. Выбрать нужный элемент по тексту
        MobileElement firstOption = appiumDriver.findElementByXPath("//*[@text='webdriver.io is awesome']");
        firstOption.click();

        // 6. Сделать скриншот с типом вывода файл
        File formScreenBase64Data = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.FILE);

        // путь скриншота из примера, ПУТЬ указать свой
        String formScreenFilePath = System.getProperty("user.dir") + "/screenshot/" + "formScreen.png";

        try {
            FileUtils.copyFile(formScreenBase64Data, new File(formScreenFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
