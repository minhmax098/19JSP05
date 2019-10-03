package javacore.day3;

public class Employee {
	public String name;
	public int id;
	public double salary;
	public String job;
	
	public Employee(String name, int id, double salary, String job)
	{
		this.name= name;
		this.id = id;
		this.salary = salary;
		this.job = job;
	}

	public void createEmployee() {
		
	}
	public void showEmployee() {
		
	}
	public void printInfoOfEmloyee() {
		System.out.println(id + "   " + name + "   " + salary + "   " + job);
	}
	

}
