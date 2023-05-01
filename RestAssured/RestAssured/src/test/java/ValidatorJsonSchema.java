import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class ValidatorJsonSchema {
    //https://www.youtube.com/watch?v=rkGI32WXmPQ&list=PLhW3qG5bs-L8xPrBwDv66cTMlFNeUPdJx&index=10
    //Для конвертирования json в json scheme используем https://www.liquid-technologies.com/online-json-to-schema-converter
    //На папку target нажать пкм выбрать properties во вкладке resource В разделе location: нажать открыть папку, в папке target/classes
    //создать файл scheme.json открыть через тексторвый редактор и поместить в него Json схему сконвертированную из json
    // добавить зависимосьт json scheme validator
    // https://github.com/rest-assured/rest-assured/wiki/Usage#json-schema-validation

    @Test
    public void testGet() {

        baseURI = "https://reqres.in/api";

        given()  // получить
                .get("/users?page=2")
                .then()
                .assertThat().body(matchesJsonSchemaInClasspath("schema.json"))
                .statusCode(200)
                .body("data[4].first_name", equalTo("George"))
                .body("data.first_name", hasItems("George", "Rachel")); // проверить в массиве содержатся персонажи с именами:

    }

}
