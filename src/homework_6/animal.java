package homework_6;

public class animal {
	String name;
	int age ;
	String breed;
	
	
	
	public animal(String name,int age,String breed) {
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
