package springmvc;

public class IndexData {
    private String id;
    private String message;

    public IndexData(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }
}
