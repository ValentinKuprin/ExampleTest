import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LaunchApp {
    public static void main(String[] args) {

        try {
            //Driver instance
            AppiumDriver<MobileElement> appiumDriver;

            //Выбор метода отправки на Аппиум сервер (DesireCapablities)
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
            desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

            // Настройка URL для аппиум сервера
            URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");
            appiumDriver = new AppiumDriver<>(appiumServer, desiredCapabilities);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
