package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtistsDao implements Artists {
    private Connection connection;

    public ArtistsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Artist> all() {
        List<Artist> artists = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM bigfoot_test_db.albums");
            while (resultSet.next()) {
                Artist artist = new Artist(
                        resultSet.getLong("id"),
                        resultSet.getString("artist"),
                        resultSet.getString("songName"),
                        resultSet.getInt("release_date"),
                        resultSet.getInt("sales"),
                        resultSet.getString("genre")
                );
                artists.add(artist);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return artists;
    }

    @Override
    public void insert(Artist artist) {

    }
}
