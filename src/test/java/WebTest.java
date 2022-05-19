import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class WebTest {
    //
    @Test
    public void testMenuStartTitle() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        //String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath = "D:\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement menuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );

        menuBrowseLanguages.click();


        WebElement menuStart = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']")
        );

        menuStart.click();

        WebElement h2 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));

        String actualResult = h2.getText();//получить текс из хпаф

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    @Test //TC_11_01
    public static void testHeading() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "D:\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement header = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='header']/h1")
        );

        String actualResult = header.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    @Test //TC_11_02
    public static void testLastItemMenu() {

        String chromeDriver = "webdriver.chrome.driver";
        //String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath = "D:\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit new Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement lastMenuItemName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']" +
                        "/li[last()]/a[@href='/submitnewlanguage.html']")
        );

        String actualResult = lastMenuItemName.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    @Test //TC_11_03
    public static void testTitleLastItemMenu() {
        String chromeDriver = "webdriver.chrome.driver";
        //String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath = "D:\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit new Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement buttonLastMenuItem = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']" +
                        "/li[last()]/a[@href='/submitnewlanguage.html']")
        );

        buttonLastMenuItem.click();

        WebElement title = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']" +
                        "/li/a[@href='./submitnewlanguage.html']")
        );

        String actualResult = title.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    @Test //TC_11_04
    public static void testNameFirstItemSubmenu() {
        String chromeDriver = "webdriver.chrome.driver";
        //String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath = "D:\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/abc.html";
        String expectedResult = "0-9";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement nameSubmenu = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='0.html']")
        );

        String actualResult = nameSubmenu.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    @Test //TC_11_06
    public static void testNameCreatorOfTheSite() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
       if (Files.exists(Path.of(driverPath))){ //существует или нет
           System.setProperty(chromeDriver, driverPath);

       } else {
           System.setProperty(chromeDriver, driverPath1);
       }
        WebDriver driver = new ChromeDriver();
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Oliver Schade";
        String expectedResult1 = "Gregor Scheithauer";
        String expectedResult2 = "Stefan Scheler";




        driver.get(url);
        WebElement submenuTeam = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='team.html']")
        );

        submenuTeam.click();

        WebElement nameOliverSchade = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[text()='Oliver Schade']")
        );

        WebElement nameGregorScheithauer = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[text()='Gregor Scheithauer']")
        );

        WebElement nameStefanScheler = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[text()='Stefan Scheler']")
        );

        String actualResult = nameOliverSchade.getText();
        String actualResult1 = nameGregorScheithauer.getText();
        String actualResult2 = nameStefanScheler.getText();

        Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(actualResult1,expectedResult1);
        Assert.assertEquals(actualResult2,expectedResult2);

        driver.quit();
    }


    @Test //TC_11_07 ПРИДУМАТЬ!
    public static void testMyOwnAutoTest() {
        String chromeDriver = "webdriver.chrome.driver";
        //String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath = "D:\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
    }

    @Test //TC_11_11
    public static void testIsEmptyRequiredField() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
       // String driverPath = "D:\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement fieldLanguageName = driver.findElement(
                By.xpath("//input[@name='language']") ////body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@name='language']
        );
        WebElement fieldAuthor = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@name='author']")
        );
        WebElement fieldEmail = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@name='email']")
        );
        WebElement fieldCaptcha = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@name='captcha']")
        );
        WebElement fieldCode = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/textarea[@name='code']")
        );

        WebElement buttonSubmitLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@type='submit']")
        );

        fieldLanguageName.sendKeys("fg");
        Thread.sleep(2000);



            buttonSubmitLanguage.click();

        WebElement fieldLanguageName1 = driver.findElement(
                By.xpath("//input[@name='language']")
        );

        fieldLanguageName1.getAttribute("value"); //.isEmpty();
        fieldLanguageName1.getText();
        System.out.println(fieldLanguageName1.getAttribute("value"));

        Boolean isFielsEmpty = fieldLanguageName.getText().isEmpty() && fieldAuthor.getText().isEmpty() && fieldEmail.getText().isEmpty()
                && fieldCaptcha.getText().isEmpty() && fieldCode.getText().isEmpty();

        Assert.assertFalse(isFielsEmpty, "Поле заполнено" );

//        WebElement error = driver.findElement(
//                By.xpath("//body/div[@id='wrap']/div[@id='main']/p/b/u['Error']")
//        );

            WebElement message = driver.findElement(
                    By.xpath("//body/div[@id='wrap']/div[@id='main']/p[text()=' Precondition failed - Incomplete Input.']")
            );

            String actualResult = message.getText();

            Assert.assertEquals(actualResult, expectedResult);

        //Assert.assertTrue(false);


            driver.quit();
        }


    @Test //TC_11_12
    public static void isEmptyField() {
        String chromeDriver = "webdriver.chrome.driver";
        //String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath = "D:\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();


        driver.get(url);
        driver.findElement(
                        By.xpath("//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@type='submit']"))
                .click();
        WebElement errorEmptyConfirmField = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/p"));
        String errorMessage = errorEmptyConfirmField.getText();
        System.out.println(errorMessage);

        if (errorMessage.contains(":") && errorMessage.contains("-") && errorMessage.contains(".")) {
        }
        String[] errorWords = errorMessage.replace(":", "")
                .replace("- ", "").replace(".", "").split(" ");
        System.out.println(Arrays.toString(errorWords));

        String[] testWords = {"Error","Precondition", "failed", "Incomplete", "Input"};

        Boolean result;

        for (int i = 0; i < errorWords.length; i++) {
            if (Character.toString(errorWords[i].charAt(0))
                    .equals(Character.toString(testWords[i].charAt(0)))) {
                result = true;
            } else {
                result = false;
            }
            Assert.assertTrue(result);

        }
        driver.quit();
    }

    @Test //TC_11_13
    public static void confirmFirstItemList() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        // String driverPath = "D:\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "IMPORTANT: Take your time! The more carefully you fill out this form " +
                "(especially the language name and description), the easier it will be for us and the faster " +
                "your language will show up on this page. We don't have the time to mess around with fixing " +
                "your descriptions etc. Thanks for your understanding.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement redBackground = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span"));
       WebElement importanWord = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span/b"));
      // WebElement = textFirstItem = driver.findElement(By.xpath(""));



    }


}
