import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {
    public static void main(String[] args) {
        AlbumBean album1 = new AlbumBean(1, "AC/DC", "Back in Black", 1980, 30.1, "Hard Rock");
        AlbumBean album2 = new AlbumBean(2, "Pink Floyd", "The Dark Side of the Moon", 1973, 42.4, "Progressive Rock");
        AlbumBean album3 = new AlbumBean(3, "The Beatles", "Abbey Road", 1969, 47.3, "Rock");
        AlbumBean album4 = new AlbumBean(4, "Michael Jackson", "Thriller", 1982, 42.2, "Pop");
        AlbumBean album5 = new AlbumBean(5, "Nirvana", "Nevermind", 1991, 39.6, "Grunge");

        AuthorBean author1 = new AuthorBean(1, "Stephen", "King");
        AuthorBean author2 = new AuthorBean(2, "J.K.", "Rowling");
        AuthorBean author3 = new AuthorBean(3, "Ernest", "Hemingway");
        AuthorBean author4 = new AuthorBean(4, "Jane", "Austen");
        AuthorBean author5 = new AuthorBean(5, "Harper", "Lee");

        QuoteBean quote1 = new QuoteBean(1, 3, "The best way to find out if you can trust somebody is to trust them.");
        QuoteBean quote2 = new QuoteBean(2, 3, "The world breaks everyone, and afterward, some are strong at the broken places.");
        QuoteBean quote3 = new QuoteBean(3, 4, "Friendship is certainly the finest balm for the pangs of disappointed love.");
        QuoteBean quote4 = new QuoteBean(4, 1, "Monsters are real, and ghosts are real too. They live inside us, and sometimes, they win.");
        QuoteBean quote5 = new QuoteBean(5, 1, "Get busy living, or get busy dying.");

        ArrayList<QuoteBean> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);
        quotes.add(quote5);

        ArrayList<AuthorBean> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);
        authors.add(author5);

        ArrayList<AlbumBean> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        albums.add(album4);
        albums.add(album5);

        for (QuoteBean quote : quotes) {
            int authorID = quote.getAuthorID();
            for (AuthorBean author : authors){
                if (author.getId() == authorID){
                    System.out.println(author.getFirstName() + " " + author.getLastName() + ": " + quote.getContent());
                }
            }
        }

    }
}
