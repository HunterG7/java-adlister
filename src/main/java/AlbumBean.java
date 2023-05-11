public class AlbumBean {
    private int id;
    private String artist;
    private String songName;
    private double releaseDate;
    private double sales;
    private String genre;

    // constructors
    public AlbumBean() {}
    public AlbumBean(int id, String artist, String songName, double releaseDate, double sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.songName = songName;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }

    // getters/setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public double getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(double releaseDate) {
        this.releaseDate = releaseDate;
    }
    public double getSales() {
        return sales;
    }
    public void setSales(double sales) {
        this.sales = sales;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
