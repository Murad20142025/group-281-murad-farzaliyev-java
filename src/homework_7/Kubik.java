package homework_7;

public class Kubik {
public static void main (String[]args) {

	
public	int Kub() {
	
	
	return(int)(Math.random()*6)+1;
	
	
	
}
int vsegoOch=0;
for(int i =1;i<=15;i++) {
int Och=Kub();
System.out.println("Бросок " + i + ": " + очки);
vsegoOch+=Och;
if(очки == 1) System.out.println("Очень плохо...");
if(очки == 6) System.out.println("Классно! Шестёрка!");
}
System.out.println("Всего набрано очков: " + vsegoOch);
}
}
