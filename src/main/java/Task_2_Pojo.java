public class Task_2_Pojo {

    private String title;
    private String body;
    private int userId;

    public Task_2_Pojo() {
    }

    public Task_2_Pojo(String title, String body, int userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }



    public String getTitle() {
        return title;
    }

    public Task_2_Pojo setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Task_2_Pojo setBody(String body) {
        this.body = body;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Task_2_Pojo setUserId(int userId) {
        this.userId = userId;
        return this;
    }
}
