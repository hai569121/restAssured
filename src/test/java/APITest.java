import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("smoke")
public class APITest {
    @Test
    @Order(3)
    public void test1() {
        given().

        when().
                get("https://jsonplaceholder.typicode.com/posts/1").
        then().
                log().body();
    }

    @Test
    @Order(2)
    public void test2() {
        given().

                when().
                get("https://jsonplaceholder.typicode.com/posts/2").
                then().
                log().body();
    }

    @Test
    @Order(1)
    public void test3() {
        given().

                when().
                get("https://jsonplaceholder.typicode.com/posts/3").
                then().
                log().body();
    }
}
