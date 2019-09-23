package Lab1;

public class MainProgram {
	public static void main(String[] args) {
		Student student1 = new Student("Dave","boy",6);
		Student student2 = new Student("Joy","boy",7);
		Student student3 = new Student("Juli","girl",7);
		
		System.out.println("Student1: "+ student1.name+ " "+ student1.gender+" "+student1.age);
		System.out.println("Student2: "+ student2.name+ " "+ student2.gender+" "+student2.age);
		System.out.println("Student3: "+ student3.name+ " "+ student3.gender+" "+student3.age);
		
	}

}
