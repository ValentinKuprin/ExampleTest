import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExamples {

    @Test
    public void checkStatusCodeAndGetInfo() {
        Response response = get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());        //Получить статус код
        System.out.println(response.getTime());  //Получить время ответа в мс
        System.out.println(response.getBody().asString()); //Получить тело в виде строки
        System.out.println(response.asString()); //Получить тело в виде строки
        System.out.println(response.getStatusLine()); // (HTTP/1.1 200 OK)
        System.out.println(response.getHeader("content-type")); //Получить заголовок (application/json; charset=utf-8)

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

    }

    @Test  //https://www.youtube.com/watch?v=iXQimBnjgfc&list=PLhW3qG5bs-L8xPrBwDv66cTMlFNeUPdJx&index=5
    public void checkKeyAndValueJson() {
        baseURI = "https://reqres.in/api";

        given()
                .get("/users?page=2")//перейти на эндпоинт
        .then().statusCode(200)  // проверить статус код (экономим время, если статус не будет соответствовать)
                .body("data[1].id", equalTo(8))  //jsonpathfinder.com - получить путь к элементу (есть аддон для хрома)
                .log().all(); //записать ответ в журнал
    }
}
