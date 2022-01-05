package mx.edu.j2se.lectures.examples.lecture11;

import java.sql.*;

public class JDBCExample {
	public static void main(String[] args) throws ClassNotFoundException {
		// Driver
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("Driver ready...");
		
		//Connection
		String dbUrl = "jdbc:mariadb://localhost:3306/my_shop";
		
		//Connecting
		try(Connection connection = DriverManager.getConnection(dbUrl, "root", "12345");
		    Statement statement = connection.createStatement() ) {
			System.out.println("Connected to DB...");
			//Executing query
			try(ResultSet rs = statement.executeQuery("select * from items")){
				System.out.println("Statement executed!");
				// Printing results
				while(rs.next()) {
					System.out.print(rs.getInt(1)+", ");
					System.out.print(rs.getString("title")+", ");
					System.out.print(rs.getDouble("price")+", ");
					System.out.print(rs.getString("category")+"\n");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
