package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Quote;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDao implements Quotes {
    private List<Quote> quotes = new ArrayList<Quote>();
    private Connection connection;

    public QuotesDao(){
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
    public List<Quote> all() {
        List<Quote> quotes = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM bigfoot_test_db.albums");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return quotes;
    }

    @Override
    public void insert(Quote quote) {
        quotes.add(quote);
    }
}
