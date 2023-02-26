package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AppiumDriverEx;

import java.util.List;

public class HandleMultipleMatchElements {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();

        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
        loginLabel.click();

        WebDriverWait wait = new WebDriverWait(appiumDriver, 30L);
        // Ставим условие ожидание что количество элементов должно быть равно 2
        wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.xpath("//*[@text='Login']"), 2));

        List<MobileElement> loginElements = appiumDriver.findElementsByXPath("//*[@text='Login']");
        System.out.println("Сколько элементов найдено " + loginElements.size());
// Плохая практика, но если нет других возможностей найти уникальный элемент ывбираем по индексу
        final int LOGIN_TEXT_FORM_INDEX = 0;
        final int LOGIN_MENU_TEXT_INDEX = 1;

        loginElements.get(LOGIN_TEXT_FORM_INDEX).click();
        loginElements.get(LOGIN_MENU_TEXT_INDEX).getText();
    }
}
