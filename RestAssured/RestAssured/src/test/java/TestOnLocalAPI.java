import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestOnLocalAPI {
    @Test
    public void get() {
        baseURI = "http://localhost:3000";
        given().get("/user").then().statusCode(200).log().all();
    }

    @Test
    public void post() {
        JSONObject request = new JSONObject();
        request.put("firstName", "Thomas");
        request.put("lastName", "Edison");
        request.put("subjsctId", 1);

        baseURI = "http://localhost:3000";
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("/user")
                .then()
                .statusCode(201);
    }

    @Test
    public void put() {
        JSONObject request = new JSONObject();
        request.put("firstName", "Albert");
        request.put("lastName", "Einstein");
        request.put("subjsctId", 2);

        baseURI = "http://localhost:3000";
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .put("/user/4")
                .then()
                .statusCode(200);
    }

    @Test
    public void delete() {
        baseURI = "http://localhost:3000";
                when().post("/user/4")
                .then()
                .statusCode(200);
    }
}
