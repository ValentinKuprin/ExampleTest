import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExamples {

    @Test
    public void test_1() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());        //Получить статус код
        System.out.println(response.getTime());  //Получить время ответа в мс
        System.out.println(response.getBody().asString()); //Получить тело в виде строки
        System.out.println(response.asString()); //
        System.out.println(response.getStatusLine()); //
        System.out.println(response.getHeader("content-type")); //Получить заголовок

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

    }
}
