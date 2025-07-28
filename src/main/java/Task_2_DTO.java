import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Task_2_DTO {

    String baseUrl = "https://jsonplaceholder.typicode.com/posts ";
    Task_2_Pojo task_2_pojo = new Task_2_Pojo("foo", "bar", 1);

    public Response POST_MetodTask_2 (){
        Response response = given()
                .header("Content-type", "application/json")
                .body(task_2_pojo)
                .and()
                .when()
                .post(baseUrl);
        return response;

    }
}
