package vn.demo.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String dbName = "News24h";
		String userName = "root";
		String password = "minhdeptrai09876";
		//jdbc:mysql://localhost:3306/demo
		String connectionURL = "jdbc:mysql://"+ hostName + ":3306" +dbName;
		
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}

}
