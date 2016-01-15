package aief;

public class Review {

    private final long id;
    private final String content;

    public Review(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
