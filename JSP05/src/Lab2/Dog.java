package Lab2;

public class Dog {
	public String name;
	public int age;
	public String color;
	
	public void wagging(String waggingAction) {
		System.out.println("wagging detail: "+ waggingAction);
	}
	public void barking(String barkingAction) {
		System.out.println("barking detail: "+ barkingAction);
	}
	public void eating(String eatingAction) {
		System.out.println("eating detail:  "+ eatingAction);
		
	}
	
	public Dog(String name, int age, String color)
	{
		this.name = name;
		this.age = age;
		this.color = color;
	}

}
