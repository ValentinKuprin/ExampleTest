package pom;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.LoginPage;
import pages.LoginPageWithComponents;
import utils.AppiumDriverEx;

// https://www.youtube.com/watch?v=fEZeZ4PIozM&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=30
public class setValueWithPomWithComponents {
    public static void main(String[] args) {

        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");

        // 2. Нажать на иконку Login
        loginLabel.click();

        // 3. Ввести почту
        LoginPageWithComponents loginPage = new LoginPageWithComponents(appiumDriver); //создаем новую страницу
        loginPage.credentialForm().inputUsername("client@yandex.ru"); //вызываем экземпляр повторно используемого компонента
        //TODO:  Разобраться для чего нужно credentialForm() и как вся эта цепочка работает, не понимаю!
        // 4. Ввести пароль
        loginPage.credentialForm().inputPassword("password");

        // 5. Нажать кнопку войти
        loginPage.clickLoginButton();
    }
}
