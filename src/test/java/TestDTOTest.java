import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


class TestDTOTest {

    @Test
    public void Test1 (){
    TestDTO testDTO = new TestDTO();
    Response response = testDTO.First();
    response.then()
        .assertThat().statusCode(200)
        .and()
            .assertThat().body("userId", equalTo(1))
            .assertThat().body("id", equalTo(1));

}
}