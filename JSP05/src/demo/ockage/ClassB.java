package demo.ockage;

import ClassC.ClassCC;

public class ClassB {
	int b1,b2;
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		System.out.println("a = ");
		System.out.println("b = "+ classA.b);
		System.out.println("c = "+ classA.c);
		System.out.println("d = "+ classA.d);
		
		ClassCC classCC = new ClassCC();
		System.out.println("cc= "+classCC.cc);

	}
	

}
