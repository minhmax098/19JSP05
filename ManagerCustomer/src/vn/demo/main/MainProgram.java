package vn.demo.main;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vn.demo.bo.Customer;
import vn.demo.dao.CustomerDAOImpl;
import vn.demo.idao.ICustomerDao;
import vn.demo.utils.ConnectionUtils;

public class MainProgram {
	public static List<Customer> listCustomer = new ArrayList<Customer>();
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtils.getMyConnection();
		Statement statement = connection.createStatement();

		ICustomerDao customerDAO = new CustomerDAOImpl();
		Customer customer = new Customer("hocminhkhh","123456","Da Nang");

		
	}
	
}
