package homework_4;

import java.util.Arrays;

public class Calculator {
 public int sum (int a,int b) {
 return a+b;
 }
 
 
 public double avarage(double ...numbers) {
	 int sum =0;
	 
	 for(double d:numbers) {
		 sum+=d;
	 }
	 
	 return sum/ numbers.length;
	 
	 
	 
	 public void printMax(int ...values) {
		 if(valeus.length==0) {
			 System.out.println("no numbers");
		 }else {
			 int maxN = Arrays.stream(values).max().getAsInt();
			 System.out.println("Max: "+maxN);
		 }
	 }
 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
 
 
 
 
 
 
 
 
 
 
 
}
