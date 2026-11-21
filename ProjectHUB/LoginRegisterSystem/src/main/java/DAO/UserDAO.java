package DAO;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public static boolean loginMethod(User user) {
    	boolean result=false;
    	String query="Select *from users where username=?";
    	String Password =user.getPassword();
    	try (Connection connection=DbConnection.getConnection(); 
    			PreparedStatement pStatement=connection.prepareStatement(query);){
    		pStatement.setString(1, user.getUsername());
    		
    		ResultSet rs=pStatement.executeQuery();
    		if(rs.next()) {
    			String getPassword =rs.getString("Password");
    			System.out.println("THE PASSWROD IS "+getPassword);
    			if(getPassword.equals(Password)) {
    				result=true;
    			}
    			
    		}
    	}catch (SQLException e) {
    		
			e.printStackTrace();
		}
    	return result;
    }
}