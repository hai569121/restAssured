import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("smoke")
public class APITestPost {

    @Test
    @Order(1)
    public void TestPost1() {
        //Map<String, String> headers = new HashMap<>();
        //headers.put("Content-Type", "application/json;charset=UTF-8");
        String JsonString = "{\"title\":\"foo\",\"name\":\"张三\"}";
        given().
                contentType(ContentType.JSON).
                body(JsonString).
        when().
                post("https://jsonplaceholder.typicode.com/posts").
        then().
                log().
                all().
                assertThat().body("title",equalTo("foo"));

    }

    @Test
    @Order(2)
    public void TestPost2() {
        given().
                multiPart(new File("C:\\Users\\59612\\Desktop\\1.png")).
        when().
                post("http://www.httpbin.org/post").
        then().
                log().
                all();



    }

}
