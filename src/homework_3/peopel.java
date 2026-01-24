package homework_3;

public class peopel {
	String name;
	int age;
	double averageGrade;

	public  peopel (	String name,int age,double averageGrade) {
		this.name=name;
		this.age =age;
		this.averageGrade=averageGrade;
	}
	public void	eat() {
		System.out.println(name+"eat");
	}	
}
