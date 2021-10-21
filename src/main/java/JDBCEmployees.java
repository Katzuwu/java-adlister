import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCEmployees {
	public static void main(String[] args) {
		try{
			DriverManager.registerDriver(new Driver());
			Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
				"root",
				"codeup"
			);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM employees LIMIT 10");
			while (resultSet.next()){
				System.out.println(resultSet.getString("first_name"));
			}
		}catch (SQLException throwables){
			throwables.printStackTrace();
		}
	}
}
