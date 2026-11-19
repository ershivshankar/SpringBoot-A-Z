package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DB.DbConnection;
import Entities.User;

public class UserDAO {

    public static boolean insertIntoDb(User user) throws SQLException {

        String query = "INSERT INTO users(Name, Email, UserName, Password) VALUES(?, ?, ?, ?)";

        try (
            Connection conn = DbConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(query)
        ) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPassword());

            int row = ps.executeUpdate();

            return row > 0;
        }
    }
}