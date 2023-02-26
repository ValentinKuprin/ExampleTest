package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;
// https://www.youtube.com/watch?v=FWNcxr7LD8Y&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li&index=22
public class SwipeAction {
    private AppiumDriver<MobileElement> appiumDriver;
    private TouchAction touchAction;
    private PointOption startPoint;
    private PointOption endPoint;
    public SwipeAction(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
        // 4. Получить размеры экрана
        Dimension windowSize = appiumDriver.manage().window().getSize();
        int screenHeight = windowSize.getHeight();
        int screenWidth = windowSize.getWidth();

        // 5. Определить начальную и конечную точку где нажать и отпустить (свайп)
        int xStartPoint = 50 * screenWidth / 100; // начальная точка середина экрана по ширине
        int xEndPoint = 10 * screenWidth / 100; // конечная точка середина экрана по ширине

        //  6. Возможно описание начала и конца перепутаны !
        int yStartPoint = 50 * screenHeight / 100; //начальная точка откуда делаем свайп
        int yEndPoint = yStartPoint; //конечная точка там где закончится действие (свайп)

        //устанавливаем координаты начальных и конечных точек
        this.startPoint = new PointOption<>().withCoordinates(xStartPoint, yStartPoint);
        this.endPoint = new PointOption<>().withCoordinates(xEndPoint, yEndPoint);
    }
    public void swipeFromLeftToRight(int times) {
        for (int initTime = 0; initTime < times; initTime++) {
            this.swipeFromLeftToRight();
        }
    }

    public void swipeFromRightToLft(int times) {
        for (int initTime = 0; initTime < times; initTime++) {
            this.swipeFromLeftToRight();
        }
    }
    public void swipeFromLeftToRight() {
        //Выполнить сенсорное действие touch Actions  swipe from left to right direction
        touchAction
                .press(endPoint) //нажать на экран
                .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1))) //ожидание после нажатия на экран
                .moveTo(startPoint).release() // смещаемся до нужной точки и отпускаем
                .perform();
    }

    public void swipeFromRightToLft() {
        //Выполнить сенсорное действие touch Actions swipe from right to left direction
        touchAction
                .press(startPoint) //нажать на экран
                .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1))) //ожидание после нажатия на экран
                .moveTo(endPoint).release() // смещаемся до нужной точки и отпускаем
                .perform();
    }
}
