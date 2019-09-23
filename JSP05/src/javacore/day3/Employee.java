package javacore.day3;

public class Employee {
	public String name;
	public int id;
	public double salary;
	public int age;
	public boolean married;
	Job job;
	
	public Employee( int id,String name, double salary, Job job)
	{
		this.name= name;
		this.id = id;
		this.salary = salary;
		this.job = job;
	}
	

}
