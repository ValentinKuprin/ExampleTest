package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.screenrecording.CanRecordScreen;
import utils.AppiumDriverEx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
// https://www.youtube.com/watch?v=l1nEMutCVyM&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=24
// настройка сохранения видео, на 14-00 показаны трудности сохранения из-за appiumDriver который нужно поменнять на androidDriver
public class RecordVideo {
    public static void main(String[] args) {
        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();

        // 2. Начать запись экрана
        // Для записи видео нужно изменить в родительском классе:
        // AndroidDriver<MobileElement> getAndroidDriver()
        // AndroidDriver<MobileElement> androidDriver = null;
        // appiumDriver = new AndroidDriver<MobileElement>(appiumServer, desiredCapabilities);
        ((CanRecordScreen) appiumDriver).startRecordingScreen();

        // 3. Нажать на иконку Login
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
        loginLabel.click();

        // 4. Ввести почту
        MobileElement emailTxtBx = appiumDriver.findElementByAccessibilityId("input-email");//content-desc
        emailTxtBx.sendKeys("client@yandex.ru");

        // 5. Ввести пароль
        MobileElement passwordTxtBx = appiumDriver.findElementByAccessibilityId("input-password");
        passwordTxtBx.sendKeys("password");

        // 6. Нажать кнопку войти
        MobileElement loginButton = appiumDriver.findElementByAccessibilityId("button-LOGIN");
        loginButton.click();

        // Остановить запись экрана
        String video = ((CanRecordScreen) appiumDriver).stopRecordingScreen();

        // Сохранить видео в систему
        byte[] decodedVideo = Base64.getMimeDecoder().decode(video);

        try {
            Path testVideoDit = Paths.get(System.getProperty("user.dir") + "/video");
            Files.createDirectories(testVideoDit);
            Path testVideoFileLocation =
                    Paths.get(testVideoDit.toString(), String.format("%s-%d.%s", "test", System.currentTimeMillis(), "mp4"));
            Files.write(testVideoFileLocation, decodedVideo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
