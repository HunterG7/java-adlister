public class QuoteBean {
    private int id;
    private int authorID;
    private String content;

    public QuoteBean() {}
    public QuoteBean(int id, int authorID, String content) {
        this.id = id;
        this.authorID = authorID;
        this.content = content;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAuthorID() {
        return authorID;
    }
    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
