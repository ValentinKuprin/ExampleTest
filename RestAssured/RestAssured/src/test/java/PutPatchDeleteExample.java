import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PutPatchDeleteExample {
    @Test
    public void testPut() {

        JSONObject request = new JSONObject(); //преобразование JSON (json.simple), ключи и значения отображают ковычки для данных, если они были указаны (для ключа обязательный атрибут)
        request.put("name", "Raghaver");
        request.put("job", "Teacher");

        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON). //информация в каком формате передаю данные
                accept(ContentType.JSON). // ввиде чело должен прийти ответ
                body(request.toJSONString()).// тело и преобразовать его в строку
                when().
                put("/user/2"). //изменить юзера с данными указанными выше
                then().
                statusCode(200).
                log().all();
    }

    @Test
    public void testPatch() {

        JSONObject request = new JSONObject(); //преобразование JSON (json.simple), ключи и значения отображают ковычки для данных, если они были указаны (для ключа обязательный атрибут)
        request.put("name", "Raghaver");
        request.put("job", "Teacher");

        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON). //информация в каком формате передаю данные
                accept(ContentType.JSON). // ввиде чело должен прийти ответ
                body(request.toJSONString()).// тело и преобразовать его в строку
                when().
                patch("/api/user/2"). //создаем юзера с данными указанными выше
                then().
                statusCode(200).
                log().all();
    }

    @Test
    public void testDelete() {
        baseURI = "https://reqres.in/api";

                when().
                delete("/api/user/2"). //создаем юзера с данными указанными выше
                then().
                statusCode(204).
                log().all();
    }
}
