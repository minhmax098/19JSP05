package javacore.day3;

public class tong10sochandautien {
	public static void main(String[] args) {
		int sum =0;
		for(int i=0; i<=10; i++) {
			if(i%2==0) {
				sum = sum+i;
				
			}
		}
		System.out.println("Tong 10 so chan dau tien la:"+sum);
	}

}
