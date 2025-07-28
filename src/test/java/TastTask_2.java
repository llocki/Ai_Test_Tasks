import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class TastTask_2 {


    @Test
    public void Test2() {
        Task_2_DTO task_2_dto = new Task_2_DTO();

        Response response = task_2_dto.POST_MetodTask_2();

        response.then()
                .assertThat().statusCode(201)
                .assertThat().body("id", equalTo(101))
                .assertThat().body("body", equalTo("bar"))
                .assertThat().body("title", equalTo("foo"))
                .assertThat().body("userId", equalTo(1));
    }
}