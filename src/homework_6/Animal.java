package homework_6;

public class Animal {
	String name;
	int age ;
	String breed;
	
	
	
	public Animal(String name,int age,String breed) {
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	public void eat() {
		System.out.println("eat");
	}
	
	
	public void sleep() {
		System.out.println("sleep");
	}
}
