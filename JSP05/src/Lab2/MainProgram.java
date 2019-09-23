package Lab2;

public class MainProgram {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Jack",10,"yellow");
		Dog dog2 = new Dog("Kim",7,"red");
		Dog dog3 = new Dog("Linda",4,"white");
		
		System.out.println("Dog1: "+dog1.name+" "+dog1.age+" "+dog1.color);
		//System.out.println("Dog2: "+dog2.name+" "+dog2.age+" "+dog2.color);
		//System.out.println("Dog3: "+dog3.name+" "+dog3.age+" "+dog3.color);
		dog1.wagging("Vay duoi nhiet tinh");
		dog1.barking("Sua rat to ");
		dog1.eating("An rat nhieu");
	}

}
