import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class SoapXMLRequest {

    @Test
    public void validateSoapXML() throws FileNotFoundException {
        File file = new File("./resources/test.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
        //FileInputStream fileInputStream = new FileInputStream(new File("./resources/test.xml"));
        if(file.exists()) { // если файл существует
            System.out.println("file Exists");
        }//catch


        String requestBody = IOUtils.toString(fileInputStream, "UTF-8"); // добавить зависимость Apache Commons ID, тело запроса переменной(поток ввода файла, кодировка)

        baseURI = "http://dneonline.com";

        given()
                .contentType("text/xml")
                .accept(ContentType.XML)
                .body(requestBody)
                .when()
                .post("/calculator.asmx")
                .then()
                .statusCode(200)
                .log().all();
    }
}
