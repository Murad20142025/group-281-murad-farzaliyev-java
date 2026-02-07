package classwork_7_2;

public class Runner {
	public  static void main (String[]args) {
	int[] balldrug= {120, 85, 200, 95, 150, 60, 175, 110 } ;
	int bestsch =120;
	int worstsch=120;
	for(int i = 1; i < balldrug.length; i++) {
		bestsch = Math.max(bestsch,balldrug [i]);
		worstsch = Math.min(worstsch,balldrug [i]);
	}
	int raznic=bestsch-worstsch;
	
	if(raznic > 100) System.out.println("Очень большая разница!");
	}
}
