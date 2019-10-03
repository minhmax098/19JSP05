package javacore.day3;
import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job1 = new Job(1,"HR"); // Kiểu dữ liệu của job1 là Job
		Job job2 = new Job(2,"Developer"); 
		Job job3 = new Job(3,"CEO"); 
		Job job4 = new Job(4,"Tester"); 
		Job job5 = new Job(5,"BA"); 
//		Employee employee1 = new Employee(1,"Nguyen Van A",3000, job1);
//		// Hoặc: Employee employee1 = new Employee(1,"Nguyen Van A",3000, new Job(1,"HR");
//		Employee employee2 = new Employee(2,"Nguyen Van B",4000, job2);
//		Employee employee3 = new Employee(3,"Nguyen Van C",5000, job3);
//		Employee employee4 = new Employee(4,"Nguyen Van D",6000, job4);
//		Employee employee5 = new Employee(5,"Nguyen Van E",7000, job5);
		
		///System.out.println("Employee1: "+employee1.id+ " "+employee1.name+" "+employee1.salary +employee1.job);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Employee: ");
		int employee = scanner.nextInt();
		System.out.println("Employee: "+employee);
		
		
//		Employee[] employeeArray = new Employee[5];
//		employeeArray[0] = employee1;
//		employeeArray[1] = employee2;
//		employeeArray[2] = employee3;
//		employeeArray[3] = employee4;
//		employeeArray[4] = employee5;
		
//		for(int i=0; i < employeeArray.length; i++) {
//			System.out.println("Employee information: ");
//			System.out.println("ID: "+employeeArray[i].id);
//			//System.out.println("ID: "+ employeeArray[length-1].id);: lấy ở cuối mảng đối với các mảng lớn nhiều phần tử 
//			System.out.println("Name: "+employeeArray[i].name);
//			System.out.println("Salary: "+employeeArray[i].salary);
//			System.out.println("Job: "+employeeArray[i].job.name);

		}
		
//		System.out.println("Employee information: ");
//		System.out.println("ID: "+ employeeArray[4].id);
//		//System.out.println("ID: "+ employeeArray[length-1].id);: lấy ở cuối mảng đối với các mảng lớn nhiều phần tử 
//		System.out.println("Name: "+ employeeArray[4].name);
//		System.out.println("Salary: "+ employeeArray[4].salary);
//		System.out.println("Job: "+ employeeArray[4].job.name);
	}


