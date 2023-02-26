import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BottlesOfBeerFirstTest {
    //
    @Test
    public void testMenuStartTitle() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
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
    public void testHeading() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
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
    public void testLastItemMenu() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit new Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement lastMenuItemName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']" +
                        "/li[last()]/a[@href='/submitnewlanguage.html']") //после ласт лишнее, для практики
        );

        String actualResult = lastMenuItemName.getText();

        Assert.assertEquals(actualResult, expectedResult.toUpperCase());

        driver.quit();
    }

    @Test //TC_11_03
    public void testTitleLastItemMenu() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit New Language";

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
    public void testNameFirstItemSubmenu() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
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
    public void testNameCreatorOfTheSite() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
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
        String actualResult = nameOliverSchade.getText();

        Assert.assertEquals(actualResult, expectedResult);

        WebElement nameGregorScheithauer = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[text()='Gregor Scheithauer']")
        );
        String actualResult1 = nameGregorScheithauer.getText();

        Assert.assertEquals(actualResult1, expectedResult1);

        WebElement nameStefanScheler = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[text()='Stefan Scheler']")
        );
        String actualResult2 = nameStefanScheler.getText();

        Assert.assertEquals(actualResult2, expectedResult2);

        driver.quit();
    }

    @Test //TC_11_07 ПРИДУМАТЬ!
    public void testMyOwnAutoTest() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
    }

    @Test //TC_11_11
    public void testIsEmptyRequiredField() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement fieldLanguageName = driver.findElement(
                By.xpath("//input[@name='language']")
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

        fieldLanguageName1.getAttribute("value");
        fieldLanguageName1.getText();
        System.out.println(fieldLanguageName1.getAttribute("value"));

        Boolean isFielsEmpty = fieldLanguageName.getText().isEmpty() && fieldAuthor.getText().isEmpty() && fieldEmail.getText().isEmpty()
                && fieldCaptcha.getText().isEmpty() && fieldCode.getText().isEmpty();

        Assert.assertFalse(isFielsEmpty, "Поле заполнено");


        WebElement message = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/p[text()=' Precondition failed - Incomplete Input.']")
        );

        String actualResult = message.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }


    @Test //TC_11_12
    public void isEmptyField() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "Error";
        String expectedResult1 = "Precondition";
        String expectedResult2 = "failed";
        String expectedResult3 = "Incomplete";
        String expectedResult4 = "Input";
        String expectedResult5 = ":";
        String expectedResult6 = "-";
        String expectedResult7 = ".";
        String expectedResult8 = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.findElement(
                        By.xpath("//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@type='submit']"))
                .click();
        WebElement errorEmptyConfirmField = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/p"));
        String errorMessage = errorEmptyConfirmField.getText().trim();

        Assert.assertEquals(Character.toString(errorMessage.charAt(0)), (Character.toString(expectedResult8.charAt(0))));
        Assert.assertEquals(Character.toString(errorMessage.charAt(7)), (Character.toString(expectedResult8.charAt(7))));
        Assert.assertEquals(Character.toString(errorMessage.charAt(20)), (Character.toString(expectedResult8.charAt(20))));
        Assert.assertEquals(Character.toString(errorMessage.charAt(24)), (Character.toString(expectedResult8.charAt(24))));
        Assert.assertEquals(Character.toString(errorMessage.charAt(35)), (Character.toString(expectedResult8.charAt(35))));
        Assert.assertTrue(errorMessage.contains(":"));
        Assert.assertTrue(errorMessage.contains("-"));
        Assert.assertTrue(errorMessage.contains("."));

        driver.quit();
    }

    @Test //TC_11_13
    public void confirmFirstItemList() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "IMPORTANT: Take your time! The more carefully you fill out this form " +
                "(especially the language name and description), the easier it will be for us and the faster " +
                "your language will show up on this page. We don't have the time to mess around with fixing " +
                "your descriptions etc. Thanks for your understanding.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement textFirstItem = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li[contains(text(), 'Take')]"));
        String actualResult = textFirstItem.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    @Test //TC_11_14
    public void checkTableColumnNames() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
        String url = "http://www.99-bottles-of-beer.net/";
        Boolean expectedResult = true;

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")).click();
        WebElement firstColumnName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/table[@id='category']/tbody/tr/th[text()='Language']"));
        WebElement secondColumnName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/table[@id='category']/tbody/tr/th[text()='Author']"));
        boolean actualResult;
        if ((firstColumnName.getText().equals("Language")) && (secondColumnName.getText().equals("Author"))) {
            actualResult = true;
        } else {
            actualResult = false;
        }

        Assert.assertTrue(actualResult);

        driver.quit();
    }

    @Test //TC_11_15
    public void isNotSeeNewComments() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
        String url = "http://www.99-bottles-of-beer.net/";

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/toplist.html']")).click();
        driver.findElement(
                By.xpath("//body/div[@id='wrap']" +
                        "/div[@id='navigation']/ul[@id='submenu']/li/a[@href='./newcomments.html']")).click();
        List<WebElement> listComments = driver.findElements(By.xpath("//body/div[@id='wrap']/div[@id='main']/p"));
        Boolean result;
        if (!listComments.isEmpty()) {
            result = true;
            System.out.println(result);
        } else {
            result = false;
            System.out.println(result);
        }

        Assert.assertTrue(result, "Нет коментариев");

        driver.quit();
    }

    @Test //TC_11_24
    public void confirmWarningWhiteLetters() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath1 = "D:\\chromedriver.exe";
        if (Files.exists(Path.of(driverPath))) { //существует или нет
            System.setProperty(chromeDriver, driverPath);

        } else {
            System.setProperty(chromeDriver, driverPath1);
        }
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "background-color: red; color: white;";
        String expectedResult1 = "rgba(255, 255, 255, 1)";
        String expectedResult2 = "rgba(255, 0, 0, 1)";
        String expectedResult3 = "b";
        String expectedResult4 = "700";

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        String errorImportantStyle = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span")).getAttribute("style");

        Assert.assertEquals(errorImportantStyle, expectedResult);

        WebElement importantWord = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span/b"));

        Assert.assertEquals(importantWord.getCssValue("color"), expectedResult1);

        String backGround = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span")).getCssValue("background-color");

        Assert.assertEquals(backGround, expectedResult2);

        String bold = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span/b")).getTagName();

        Assert.assertEquals(bold, expectedResult3);

        Assert.assertEquals(importantWord.getCssValue("font-weight"), expectedResult4);
    }
}

