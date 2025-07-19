import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class TestDTO {

    String BaseUrl = "https://jsonplaceholder.typicode.com/posts/1";
    public Response First (){
            Response response = given()
                    .header("Content-type", "application/json")
                    .and()
                    .when()
                    .get(BaseUrl);
            return response;

    }
}
