package javacore.day3;

import java.util.Scanner;

public class Lab5Homework {
	
	public static void main(String[] args) {
		Employee employee[] = null;
		int c;
		Scanner input = new Scanner(System.in);
		System.out.println("Moi ban nhap lua chon");
		int select = input.nextInt();
	//	System.out.println("So ban input: ");
		System.out.println("1. Create Employee: ");
		System.out.println("2. Show the existing employee: ");
		System.out.println("3. Exit");
		
		switch(select) {
		case 1:
			System.out.println("Nhap so luong nhan vien: ");
			c = input.nextInt();
			employee = new Employee[c];
			for(int i= 1; i<= c; i++) {
				employee[i] = new Employee();
				employee[i].Create();
			}
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
