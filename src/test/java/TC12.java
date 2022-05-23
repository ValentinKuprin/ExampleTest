import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**TC_11_12 Precondition: Если на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html ,
 * пользователь нажмет кнопку Submit Language,  не заполнив информацию в обязательных полях, будет показана ошибка с текстом

 Error: Precondition failed - Incomplete Input.

 Подтвертите, что в тексте ошибки слова Error, Precondition, Incomplete и Input
 написаны с большой буквы, а слово failed  написано  с маленькой буквы.
 Так же подтвердите, что в тексте ошибки содержатся знаки :, -  и .

 *
 */
public class TC12 {

    @Test //TC_11_12
    public static void isEmptyField() {
        String chromeDriver = "webdriver.chrome.driver";
        //String driverPath = "C:\\Users\\xBrooKx\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driverPath = "D:\\chromedriver.exe";
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
        System.out.println(errorMessage);

        for (int i = 0; i < errorMessage.length(); i++) {
            if ()

        }


        Assert.assertTrue(Character.toString(errorMessage.charAt(0)).equals(Character.toString(expectedResult.charAt(0)))); //E

























        if (errorMessage.contains(":") && errorMessage.contains("-") && errorMessage.contains(".")) {
        }
        String[] errorWords = errorMessage.replace(":", "")
                .replace("- ", "").replace(".", "").split(" ");
        System.out.println(Arrays.toString(errorWords));

        String[] testWords = {"Error", "Precondition", "failed", "Incomplete", "Input"};

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

}
