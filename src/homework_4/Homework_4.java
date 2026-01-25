package homework_4;

public class Homework_4 {
	public static void main(String[] args) {
		
		
		
		Calculator c =new Calculator();
		
		
		
		int result =c.sum(6, 7);
		System.out.println("result: "+result);
		
		
		
		double resultAvg =c.avarage(12.3,44.20,5.4,3.45);
		System.out.println("result: "+resultAvg);
		c.printMax(3,2,1,8,23);
	}
}
