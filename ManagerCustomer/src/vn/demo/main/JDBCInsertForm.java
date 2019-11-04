package vn.demo.main;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import vn.demo.utils.ConnectionUtils;

public class JDBCInsertForm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Username: ");
		String user = scanner.nextLine();
		System.out.println("Password: ");
		String pass = scanner.nextLine();
		try {
			Connection connection = ConnectionUtils.getMyConnection();
			Statement statement = connection.createStatement();
			String sql="INSERT INTO DangNhap1(Username,Password) VALUES (\""+user+"\",\""+pass+"\")";
			int rowCount = statement.executeUpdate(sql);
			String sql2 =" UPDATE DangNhap1(Username, Password) SET Username = 'hocminh09876' where id=1";
			int colCount = statement.executeUpdate(sql2);
			
		      // In ra số dòng được trèn vào bởi câu lệnh trên.
		      System.out.println("Row Count affected = " + rowCount);
		      System.out.println("Col Count affected = " + colCount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
