package vn.demo.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import vn.demo.utils.ConnectionUtils;

public class InsertDataExemple {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtils.getMyConnection();
		Statement statement = connection.createStatement();
		String sql = "Insert into CategorY(Id, Name)" + "values (1,'Minh')";	
		//Thực thi câu lệnh
		//execute Update sử dụng các câu lệnh insert, update, delete
		int rowCount = statement.executeUpdate(sql);
		
		//In ra số dòng trên bởi câu lệnh 
		System.out.println("Row Count affected: " + rowCount);
	}

}
