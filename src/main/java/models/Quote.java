package models;

public class Quote {

    private long id;
    private String content;
    private Artist author;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Artist getAuthor() {
        return author;
    }
    public void setAuthor(Artist author) {
        this.author = author;
    }

    public Quote() {}

    public Quote(long id, String content, Artist author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}
