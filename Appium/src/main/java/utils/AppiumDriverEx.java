package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppiumDriverEx {
    //https://www.youtube.com/watch?v=ASWEBY6bP2o&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=10

    public static AppiumDriver<MobileElement> getAppiumDriver() {
        //Driver instance
        AppiumDriver<MobileElement> appiumDriver = null;
        try {
            //Выбор метода отправки на Аппиум сервер (DesireCapablities)
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.PLATFORM_NAME,"ANDROID");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.AUTOMATION_NAME,"uiautomator2");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.UDID,"emulator-5554");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.APP_PACKAGE,"com.wdiodemoapp");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.APP_ACTIVITY,"com.wdiodemoapp.MainActivity");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.NEW_COMMAND_TIMEOUT,120);


            // Настройка URL для аппиум сервера
            URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");
            appiumDriver = new AppiumDriver<>(appiumServer, desiredCapabilities);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return appiumDriver;
    }
}
