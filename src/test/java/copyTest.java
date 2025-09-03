import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class copyTest {

    @Test
    public void test1() {
        given().

                when().
                get("https://jsonplaceholder.typicode.com/posts/1").
                then().
                log().body();
    }



}

