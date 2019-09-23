package javacore.day3;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int a = input.nextInt();
		System.out.println("So ban input: "+ a);
		
		switch(a) {
		case 1:
			System.out.println("Create Employee");
			break;
		case 2:
			System.out.println("Existing Employee");
			break;
		case 3: 
			System.out.println("Exit");
			break;
		default:
			System.out.println("The number is strange");
			break;
		
		}
		
	}

}
