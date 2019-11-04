package vn.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import vn.demo.bo.Customer;
import vn.demo.idao.ICustomerDao;

import vn.demo.utils.ConnectionUtils;

public class CustomerDAOImpl implements ICustomerDao{

	@Override
	public void addCustomer(Customer customer, Statement statement) throws SQLException 
	{
			String sql ="Insert into Customer(username,password,address) values(\""+customer.username+"\",\""+ customer.password+"\",\""+ customer.address+"\")";
			statement.executeUpdate(sql);
			System.out.println("Insert sucessfully");
		
	}

	
	public void deleteCustomerById(int id, Customer customer, Statement statement) throws SQLException{
		String sql1 = "Delete from Customer WHERE id = "+ id;
		statement.executeUpdate(sql1);
		System.out.println("Delete successfully");
		
	}

	@Override
	public void updateCustomer(int id, String username, String password, String address, Statement statement) throws SQLException {
	
		String sql2="UPDATE Customer" + " SET username ='"+username+"', password = '"+password+"', address = "+ address
				+" WHERE id = "+ id;
		statement.executeUpdate(sql2);
		System.out.println("Update successfully");
	}

	public void addAllCustomerInArrayList( List<Customer> list, Statement statement) throws SQLException {
		ResultSet rs = statement.executeQuery("select * from Users");
		while(rs.next()) {
			Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getNString(4));
			list.add(customer);
		}
	}

	@Override
	public void findCustomerById(int id,Statement statement) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs = statement.executeQuery("select * from Customer WHERE id = "+id);
		while(rs.next()) {
			Customer customer = new Customer( rs.getString(2), rs.getString(3),rs.getString(4));
			System.out.println(id+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
		
	}

	@Override
	public void printAllCustomerInfor(List<Customer> list) {
		for(Customer i: list) {
			System.out.println(i.getId()+"\t"+i.getUsername()+"\t"+i.getPassword()+"\t\t"+i.getAddress()); }		
	}
	
	
}
