package DB;

import java.sql.Connection;

public class TestConnection {
	public static void main(String[] args) {
		try {
			
		
		Connection connection=DbConnection.getConnection();
		if(connection!=null) {
			System.out.println("The database is Sucessfully conncected");
		}}
		catch (Exception e) {
            e.printStackTrace();

			System.out.println("connection failed");
		}
	}

}
