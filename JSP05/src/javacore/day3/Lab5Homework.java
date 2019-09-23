package javacore.day3;

import java.util.Scanner;

public class Lab5Homework {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int a = input.nextInt();
		System.out.println("So ban input: " +a);
		
		switch(a) {
		case 1:
			System.out.println("Create Employee: ");
			Job job1 = new Job(1,"HR");
			Employee employee1 = new Employee(1,"Nguyen Van A",3000, job1);

			break;
			
		case 2:
			System.out.println("Show the existing employee: ");
			break;
		
		case 3:
			System.out.println("Exit: ");
			break;
			
		
		}
	}

}
