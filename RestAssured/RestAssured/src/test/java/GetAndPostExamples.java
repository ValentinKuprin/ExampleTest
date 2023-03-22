import io.restassured.http.ContentType;
import org.codehaus.groovy.runtime.powerassert.Value;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

public class GetAndPostExamples {

    @Test  //https://www.youtube.com/watch?v=EvG8r7AhanI&list=PLhW3qG5bs-L8xPrBwDv66cTMlFNeUPdJx&index=6
    public void testGet() {

        baseURI = "https://reqres.in/api";

        given()  // получить
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .body("data[4].first_name", equalTo("George"))
                .body("data.first_name", hasItems("George", "Rachel")); // проверить в массиве содержатся персонажи с именами:
    }

   @Test
    public void testPost() {
        Map<String, Object> map = new HashMap<String, Object>(); // ключ будет строкой, значение любым объектом
        map.put("name", "Raghav");
        map.put("job", "Teacher");

        System.out.println(map);

       JSONObject request = new JSONObject(map); //преобразование JSON (json.simple), ключи и значения отображают ковычки для данных, если они были указаны (для ключа обязательный атрибут)
       JSONObject request1 = new JSONObject();
       request1.put("name", "Raghaver");

       System.out.println(request);
       System.out.println(request.toJSONString());
       System.out.println(request1);

       baseURI = "https://reqres.in/api";

       given().
               header("Content-Type", "application/json").
               contentType(ContentType.JSON). //информация в каком формате передаю данные
               accept(ContentType.JSON). // ввиде чело должен прийти ответ
               body(request.toJSONString()).// тело и преобразовать его в строку
               when().post("/user"). //создаем юзера с данными указанными выше
               then().
               statusCode(201).
               log().all();
    }
}
