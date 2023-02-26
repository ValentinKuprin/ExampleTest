package apiLearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AppiumDriverEx;
import utils.SwipeAction;

import java.time.Duration;

// https://www.youtube.com/watch?v=ZeVwL4b2nVo&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=21
// https://www.youtube.com/watch?v=FWNcxr7LD8Y&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=24 оптимизация Util Class
public class SwipeHorizontally {
    public static void main(String[] args) {

        // 1. Запуск приложения
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();

        // 2. Нажать кнопку свайп
        appiumDriver.findElementByAccessibilityId("Swipe").click();

        // 3. Проверить что мы перешли на нужное окно и видим там элемент который подтверждает наш переход
        WebDriverWait wait = new WebDriverWait(appiumDriver, 30L);
        wait.until(ExpectedConditions.visibilityOf(appiumDriver.findElementByAccessibilityId("//*[@text='Swipe horizontal']")));

        SwipeAction swipeAction = new SwipeAction(appiumDriver);
        swipeAction.swipeFromLeftToRight(); // тоже самое что и закоментировано ниже
        swipeAction.swipeFromRightToLft(); // тоже самое что и закоментировано ниже
        swipeAction.swipeFromRightToLft(5);

//        // 4. Получить размеры экрана
//        Dimension windowSize = appiumDriver.manage().window().getSize();
//        int screenHeight = windowSize.getHeight();
//        int screenWidth = windowSize.getWidth();
//
//        // 5. Определить начальную и конечную точку где нажать и отпустить (свайп)
//        int xStartPoint = 50 * screenWidth / 100; // начальная точка середина экрана по ширине
//        int xEndPoint = 10 * screenWidth / 100; // конечная точка середина экрана по ширине
//
//        //  6. Возможно описание начала и конца перепутаны !
//        int yStartPoint = 50 * screenHeight / 100; //начальная точка откуда делаем свайп
//        int yEndPoint = yStartPoint; //конечная точка там где закончится действие (свайп)
//
//        //устанавливаем координаты начальных и конечных точек
//        PointOption startPoint = new PointOption<>().withCoordinates(xStartPoint, yStartPoint);
//        PointOption endPoint = new PointOption<>().withCoordinates(xEndPoint, yEndPoint);
//
//        TouchAction touchAction = new TouchAction<>(appiumDriver);
//
//        //Выполнить сенсорное действие touch Actions swipe from right to left direction
//        touchAction
//                .press(startPoint) //нажать на экран
//                .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1))) //ожидание после нажатия на экран
//                .moveTo(endPoint).release() // смещаемся до нужной точки и отпускаем
//                .perform();
//
//        //Выполнить сенсорное действие touch Actions  swipe from left to right direction
//        touchAction
//                .press(endPoint) //нажать на экран
//                .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1))) //ожидание после нажатия на экран
//                .moveTo(startPoint).release() // смещаемся до нужной точки и отпускаем
//                .perform();
    }
}
