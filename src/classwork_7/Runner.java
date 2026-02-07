package classwork_7;

public class Runner {
public  static void main (String[]args) {
	int cent =10;
	double sumcent=0.0;
	double[] cenu= { 45.6, 19.9, 99.4, 8.2, 150.7, 33.1, 67.8, 12.5, 200.0, 55.3} ;
	System.out.println( "Цены в магазине игрушек:");
	Magazintitoy c=new  Magazintitoy();
	
	
	for(double ce : cenu) {
		long alwals =Math.round(ce);
		System.out.println("Игрушка: " + cent + " → " + alwals);
		sumcent+=ce;
	}
	
	double sred =sumcent /10;
	
	System.out.println("Средняя ≈ " + Math.round(sred));
	
}
}


