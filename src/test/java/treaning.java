import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class treaning {

    @Test
    public void testDragAndDrop() throws InterruptedException { //перетягивание элемента из точки А в точку Б
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//        driver.manage().window().maximize();
//        Thread.sleep(5000);

        Actions actions = new Actions(driver);
//
        WebElement rome = driver.findElement(By.id("box6"));

        int fromOffsetX = rome.getLocation().getX();
        int fromOffsetY = rome.getLocation().getY();
        WebElement italy = driver.findElement(By.id("box106"));
        int toOffsetX = italy.getLocation().getX();
        int toOffsetY = italy.getLocation().getY();
        System.out.println("from =" + fromOffsetX + ", " + fromOffsetY);
        System.out.println("to =" + toOffsetX + ", " + toOffsetY);
//
//        actions.clickAndHold(rome).moveByOffset(toOffsetX, toOffsetY).click().release().build().perform();

 //       actions.dragAndDropBy(rome, toOffsetX, toOffsetY).release().perform();


//        actions.moveByOffset(350, 269).click().build().perform();
//        actions.moveToElement(rome).moveByOffset(490, 187).click().build().perform();
        actions.moveToElement(rome).clickAndHold().moveByOffset(400, -100).release().build().perform();
//        Thread.sleep(2000);


//        actions.clickAndHold(oslo).moveToElement(norway).release().build().perform();

//        actions.dragAndDropBy(oslo, 462, 268).click().build().perform();
//        actions.moveToElement(oslo, 350, 269 ).click().build().perform();
//        actions.moveByOffset(462, 268).click().perform();

//        System.out.println(rome.getLocation());
//        System.out.println(norway.getLocation());
//        WebElement norway = driver.findElement(By.id("box101"));
//        int offsetX = norway.getLocation().getX();
//        int offsetY = norway.getLocation().getY();
//        actions.dragAndDropBy(rome, 470, 269).build().perform();
//        actions.clickAndHold(rome).moveToElement(italy).release().build().perform();
    }

    @Test
    public void testDragAndDrop1() { //перетягивание элемента из точки А в точку Б
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
        driver.manage().window().maximize();


        WebElement from = driver.findElement(By.id("draggable"));
        int fromOffsetX = from.getLocation().getX();
        int fromOffsetY = from.getLocation().getY();
        WebElement to = driver.findElement(By.id("droppable"));
        int toOffsetX = to.getLocation().getX();
        int toOffsetY = to.getLocation().getY();
        System.out.println("from =" + fromOffsetX + ", " + fromOffsetY);
        System.out.println("to =" + toOffsetX + ", " + toOffsetY);

        Actions actions = new Actions(driver);
//        actions.clickAndHold(from).moveToElement(to).release().build().perform();
//        actions.dragAndDropBy(from, 168, 129).perform();
        actions.moveByOffset(8, 129).clickAndHold().moveByOffset(134, 100).release().build().perform();

    }
}
