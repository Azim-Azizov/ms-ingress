package singleton;

public class ApiClient {
    private static ApiClient instance;
    private Integer token;
    private String actions;
    private Integer ops = 0;

    private ApiClient() {}

    public void setToken(Integer token) {
        this.token = token;
    }

    public Integer getToken() {
        return token;
    }

    public void sendAction(String action) {
        this.actions += "#" + ++this.ops + " - " + action + "\n";
    }

    public String getActions() {
        return actions;
    }

    public String toString() {
        return "Token: " + this.token + "\nOperations made: " + this.ops;
    }

    public static ApiClient getInstance() {
        if (this.instance != null) return this.instance;
        this.instance = new ApiClient();
        return this.instance;
    }
}