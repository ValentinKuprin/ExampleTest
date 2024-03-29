import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OpenWeatherSeleniumFirstTest {

    private WebDriver driver;
    private static final String BASE_URL = "https://openweathermap.org/";

    @BeforeMethod
    public void setUp() {
        final String chromeDriver = "webdriver.chrome.driver";
        final String driverPath = "D:\\chromedriver.exe";
        final String driverPath1 = "C:\\Github\\\\tresh\\chromedriver.exe";
        final String driverPath2 = "/Users/xbrookx/Documents/chromedriver";

        if (Files.exists(Path.of(driverPath))) { // проверка существует или нет
            System.setProperty(chromeDriver, driverPath);
        } else if (Files.exists(Path.of(driverPath1))) {
            System.setProperty(chromeDriver, driverPath1);
        } else if (Files.exists(Path.of(driverPath2))) {
            System.setProperty(chromeDriver, driverPath2);
        }

//        System.setProperty("webdriver.chrome.driver", "/D:\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "/C:\\Github\\\\tresh\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "/Users/xbrookx/Documents/chromedriver");
//        или
//          static {  создаем экземпляр драйвера
//        WebDriverManager.chromeDriver().setup(); или WebDriverManager.firefoxDriver().setup() и driver = new FirefoxDriver();
//    }

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Задержки перед каждым методом, вероятно нужно использовать в BeforeTest
    }

//    @BeforeTest
//    public void setUp1() {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    @AfterMethod
    public void shutDown() {
        driver.quit();
    }

    /**
     * TC_11_01
     * 1.  Открыть базовую ссылку
     * 2.  Нажать на пункт меню Guide
     * 3.  Подтвердить, что вы перешли на страницу со ссылкой https://openweathermap.org/guide и что title этой страницы
     * OpenWeatherMap API guide - OpenWeatherMap
     */

    @Test
    public void testConfirmGoToPageAndTitlePage() throws InterruptedException {
        final String expectedGuidePage = "Guide";
        final String expectedTitle = "OpenWeatherMap API guide - OpenWeatherMap";

        driver.get(BASE_URL);

        Thread.sleep(5000);

        WebElement linkGuide = driver.findElement(By.xpath("//body/nav/ul/div/ul/li/a[@href = '/guide']"));
        linkGuide.click();
        WebElement h1Header = driver.findElement(By.xpath("//body/main//h1[@class= 'breadcrumb-title']"));
        String actualResult = h1Header.getText();
        String title = driver.getTitle();

        Assert.assertEquals(actualResult, expectedGuidePage);
        Assert.assertEquals(title, expectedTitle);
    }

    /**
     * TC_11_02
     * 1.  Открыть базовую ссылку
     * 2.  Нажать на единицы измерения Imperial: °F, mph
     * 3.  Подтвердить, что температура для города показана в Фарингейтах
     */

    @Test
    public void testChangeTemperature_FromCtoF() throws InterruptedException {
        final String expectedResult = "°F";

        driver.get(BASE_URL);

        Thread.sleep(5000);

        WebElement switchTemperature = driver.findElement(
                By.xpath("//body/main//div[@class = 'option' and contains (text(), 'Imperial:')]"));
        switchTemperature.click();
        WebElement heading = driver.findElement(By.xpath("//body/main//span[@class = 'heading']"));
        String temperature = heading.getText();
        String actualResult = temperature.substring(temperature.length() - 2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * TC_11_03
     * 1.  Открыть базовую ссылку
     * 2. Подтвердить, что внизу страницы есть панель с текстом “We use cookies which are essential for the site to work. We also use non-essential cookies to help us improve our services. Any data collected is anonymised. You can allow all cookies or manage them individually.”
     * 3. Подтвердить, что на панели внизу страницы есть 2 кнопки “Allow all” и “Manage cookies”
     */

    @Test
    public void testFootorContainsTextAndTwoButtons_AllowAndManageCookies() {
        String expectedResult = "We use cookies which are essential for the site to work. " +
                "We also use non-essential cookies to help us improve our services. Any data collected " +
                "is anonymised. You can allow all cookies or manage them individually.";
        String expectedButtonOne = "Allow all";
        String expectedButtonTwo = "Manage cookies";

        driver.get(BASE_URL);

        String actualResult = driver.findElement(
                By.xpath("//body/div//p[@class = 'stick-footer-panel__description']")).getText();
        String actualButtonOne = driver.findElement(By.xpath("//body/div//button")).getText();
        String actualButtonTwo = driver.findElement(
                By.xpath("//body/div//button/following-sibling::a")).getText();

        Assert.assertEquals(actualResult, expectedResult);
        Assert.assertEquals(actualButtonOne, expectedButtonOne);
        Assert.assertEquals(actualButtonTwo, expectedButtonTwo);
    }

    /**
     * TC_11_04
     * 1.  Открыть базовую ссылку
     * 2.  Подтвердить, что в меню Support есть 3 подменю с названиями “FAQ”, “How to start” и “Ask a question”
     */

    @Test
    public void testConfirmAvailableSupportLinksHeader() throws InterruptedException {
        final String expectedResult = "FAQ, How to start, Ask a question, ";

        driver.get(BASE_URL);

        Thread.sleep(10000);

        WebElement supportMenu = driver.findElement(By.xpath("//body/nav/ul/div/ul/li[@class = 'with-dropdown']"));
        supportMenu.click();

        List<WebElement> supportList = driver.findElements(
                By.xpath("//body/nav/ul/div/ul/li[@class = 'with-dropdown']/ul/li"));

        StringBuilder supportLinkName = new StringBuilder();

        for (WebElement link : supportList) {
            supportLinkName.append(link.getText().concat(", "));
        }

        Assert.assertEquals(supportLinkName.toString(), expectedResult);
    }

    /**
     * TC_11_05
     * 1. Открыть базовую ссылку
     * 2. Нажать пункт меню Support → Ask a question
     * 3. Заполнить поля Email, Subject, Message
     * 4. Не подтвердив CAPTCHA, нажать кнопку Submit
     * 5. Подтвердить, что пользователю будет показана ошибка “reCAPTCHA verification failed, please try again.”
     */

    @Test
    public void testSupportAskQuestion_WithoutCaptcha() throws InterruptedException {
        String expectedResult = "reCAPTCHA verification failed, please try again.";

        driver.get(BASE_URL);

        Thread.sleep(7000);

        String firstWindow = driver.getWindowHandle();

        WebElement supportMenu = driver.findElement(By.xpath("//body/nav/ul/div/ul/li[@class = 'with-dropdown']"));
        supportMenu.click();

        Thread.sleep(3000);

//        WebElement linkAskQuestion = driver.findElement(
//                By.linkText("//body/nav/ul/div/ul/li[@class = 'with-dropdown']/ul/li/a[@href = 'https://home.openweathermap.org/questions']"));
//        WebElement linkAskQuestion = driver.findElement(By.linkText("https://home.openweathermap.org/questions"));
        driver.findElement(
                By.xpath("//ul[@class = 'dropdown-menu dropdown-visible']/li/a[text()='Ask a question']")).click();

        Thread.sleep(10000);

        Set<String> currentWindows = driver.getWindowHandles();

        String newWindow = "";

        for (String window : currentWindows) {
            if (!window.equals(firstWindow)) {
                newWindow = window;
                break;
            }
        }

        driver.switchTo().window(newWindow);

        WebElement emailField = driver.findElement(By.xpath("//input[@id = 'question_form_email']"));
        emailField.click();
        emailField.sendKeys("test@test.com");

//        WebElement subjectField = driver.findElement(By.xpath("//div/input[@id = 'question_form_subject']"));
//        subjectField.click();
        driver.findElement(By.xpath("//div/select/option[@value='Sales']"));
        WebElement messageField = driver.findElement(By.xpath("//div/input[@class='form-control text required']"));
        messageField.click();
        messageField.sendKeys("Message for example");
        driver.findElement(By.xpath("//div/input[@type= 'submit']"));

        String errorNotCaptcha = driver.findElement(By.xpath("//div[@class='help-block']")).getText();

        Assert.assertEquals(errorNotCaptcha, expectedResult);

//TODO: не работает ссылка Support → Ask a question
    }

    /**
     * TC_11_06
     * 1.  Открыть базовую ссылку
     * 2.  Нажать пункт меню Support → Ask a question
     * 3.  Оставить значение по умолчанию в checkbox Are you an OpenWeather user?
     * 4. Оставить пустым поле Email
     * 5. Заполнить поля  Subject, Message
     * 6. Подтвердить CAPTCHA
     * 7. Нажать кнопку Submit
     * 8. Подтвердить, что в поле Email пользователю будет показана ошибка “can't be blank”
     */

    @Test
    public void testSupportAskQuestion_CheckboxDefaultAndEmailEmpty() throws InterruptedException {
        String expectedResult = "can't be blank";

        driver.get(BASE_URL);

        Thread.sleep(10000);

        WebElement supportMenu = driver.findElement(By.xpath("//body/nav/ul/div/ul/li[@class = 'with-dropdown']"));
        supportMenu.click();
        WebElement linkAskQuestion = driver.findElement(
                By.linkText("//body/nav/ul/div/ul/li[@class = 'with-dropdown']/ul/li/a[@href = 'https://home.openweathermap.org/questions']"));
        linkAskQuestion.click();

        //TODO: не работает ссылка Support → Ask a question
    }

    /**
     * TC_11_07
     * 1.  Открыть базовую ссылку
     * 2.  Нажать на единицы измерения Imperial: °F, mph
     * 3.  Нажать на единицы измерения Metric: °C, m/s
     * 4.  Подтвердить, что в результате этих действий, единицы измерения температуры изменились с F на С
     */

    @Test
    public void testChangeTemperature_From_F_to_C() throws InterruptedException {
        String expectedResult = "C";

        driver.get(BASE_URL);

        Thread.sleep(5000);

        WebElement baseTC = driver.findElement(By.xpath("//body/main//span[@class='heading']"));
        String typeTC = baseTC.getText().substring(baseTC.getText().length() - 1);
        WebElement switchTemperatureTo_F = driver.findElement(
                By.xpath("//body/main//div[@class = 'option' and contains (text(), 'Imperial:')]"));
        switchTemperatureTo_F.click();
        WebElement baseTF = driver.findElement(By.xpath("//body/main//span[@class='heading']"));
        String typeTF = baseTC.getText().substring(baseTC.getText().length() - 1);

        if (!(typeTC.equals(typeTF))) {
            WebElement switchTemperatureTo_C = driver.findElement(
                    By.xpath("//body/main//div[@class = 'option' and contains (text(), 'Metric:')]"));
            switchTemperatureTo_C.click();
        }

        String actualResult = baseTC.getText().substring(baseTC.getText().length() - 1);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * TC_11_08
     * 1.  Открыть базовую ссылку
     * 2.  Нажать на лого компании
     * 3.  Дождаться, когда произойдет перезагрузка сайта, и подтвердить, что текущая ссылка не изменилась
     */

    @Test
    public void testReloadingHomePage() throws InterruptedException {

        driver.get(BASE_URL);

        Thread.sleep(5000);

        driver.findElement(By.xpath("//body/nav/ul/li/a[@href='/']")).click();
        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(BASE_URL, actualResult);
    }

    /**
     * TC_11_09
     * 1.  Открыть базовую ссылку
     * 2.  В строке поиска в навигационной панели набрать “Rome”
     * 3.  Нажать клавишу Enter
     * 4.  Подтвердить, что вы перешли на страницу в ссылке которой содержатся слова “find” и “Rome”
     * 5. Подтвердить, что в строке поиска на новой странице вписано слово “Rome”
     */

    @Test
    public void testUrlContains_FindWordAnd_RomeWord_And_FieldSearchContains_RomeWord() throws InterruptedException {
        String expectedOne = "find";
        String expectedTwo = "Rome";

        driver.get(BASE_URL);

        Thread.sleep(7500);

        WebElement searchField = driver.findElement(By.xpath("//body/nav/ul/div/form/input[@type='text']"));
        searchField.click();
        searchField.sendKeys("Rome");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        String actualResult = driver.findElement(By.xpath("//div/input[@id = 'search_str']")).getText();

        Assert.assertTrue(driver.getCurrentUrl().contains(expectedOne));
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedTwo));
        Assert.assertEquals(actualResult, expectedTwo); //TODO: Не получается найти результат
    }

    /** TC_11_10
     1.  Открыть базовую ссылку
     2.  Нажать на пункт меню API
     3.  Подтвердить, что на открывшейся странице пользователь видит 30 оранжевых кнопок */

    @Test
    public void testVisible30OrangeButton() throws InterruptedException {
        int expected = 30;

        driver.get(BASE_URL);

        Thread.sleep(5000);

        driver.findElement(By.xpath("//li/a[@href = '/api']")).click();

        Thread.sleep(2000);

        int actualResult = driver.findElements(
                By.xpath("//a[@class = 'btn_block orange round' or @class = 'ow-btn round btn-orange']")).size();

        Assert.assertEquals(actualResult, expected);
    }

    @Test
    public void testH2TagText_WhenSearchingCityCountry() throws InterruptedException {

        final String url = "https://openweathermap.org/";
        final String cityName = "Paris";
        final String expectedResult = "Paris, FR";

        driver.get(url);

        Thread.sleep(5000);

        WebElement searchCityField = driver.findElement(
                By.xpath("//div[@id = 'weather-widget']//input[@placeholder = 'Search city']"));
        searchCityField.click();
        searchCityField.sendKeys(cityName);
        WebElement searchButton = driver.findElement(By.xpath("//button[@type =  'submit']"));
        searchButton.click();

        Thread.sleep(1000);

        WebElement parisFRChoiceInDropdownMenu = driver.findElement(
                By.xpath("//ul[@class = 'search-dropdown-menu']/li/span[text() = 'Paris, FR ']"));
        parisFRChoiceInDropdownMenu.click();

        Thread.sleep(1500);

        WebElement h2CityCountryHeader = driver.findElement(By.xpath("//div[@id = 'weather-widget']//h2"));
        String actualResult = h2CityCountryHeader.getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
