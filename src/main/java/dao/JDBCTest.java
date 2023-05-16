package dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {

    private static List<String> getNames() {
        List<String> usernames = new ArrayList<>();

        try {
            // establish connection to db
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bigfoot_test_db",
                    "root",
                    "brooks1231");

            // create statement
            Statement statement = connection.createStatement();
            // execute statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM bigfoot_test_db.albums");
            // iterate over results
            while (resultSet.next()) {
                String username = resultSet.getString("artist");
                usernames.add(username);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usernames;
    }
}
