package vn.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtillss {
	public static Connection getJDBC()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				return DriverManager.getConnection("jdbc:mysql://localhost:3306/Customer?useSSL=false","root","minhdeptrai09876");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
     public static void main(String[] args) {
		Connection conn=getJDBC();
		if (conn!=null) {
			System.out.println("Thanh cong");
			
		}
		else
		{
			System.out.println("That bai");
		}
	}
	 public static Connection getMyConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}
