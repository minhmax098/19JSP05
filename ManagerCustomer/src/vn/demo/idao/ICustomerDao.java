package vn.demo.idao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import vn.demo.bo.Customer;

// định nghĩa hàm vào trong interface, chỉ khai báo kiểu trả về , k cần khai báo nội đung bên trong
public interface ICustomerDao 
{
	public void addCustomer (Customer customer, Statement statement) throws SQLException;
	

	void deleteCustomerById(int id, Customer customer, Statement statement) throws SQLException;
	void updateCustomer(int id, String username, String password, String address, Statement statement)
			throws SQLException;
	void findCustomerById(int id, Statement statement) throws SQLException;


	void addAllCustomerInArrayList(List<Customer> list, Statement statement) throws SQLException;


	void printAllCustomerInfor(List<Customer> list);
}
