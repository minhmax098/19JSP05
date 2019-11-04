package vn.demo.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	private static String hostName = "localhost";
	private static String dbName = "Customer";
	private static String UserName = "root";
	private static String password = "minhdeptrai09876";
	private static String connectionULR = "jdbc:mysql://"+hostName+":3306/"+dbName;

	public static Connection getMyConnection() throws ClassNotFoundException, SQLException{
		Connection conn = DriverManager.getConnection(connectionULR, UserName, password);
		return conn;
	}
		
}

