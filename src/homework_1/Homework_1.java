package homework_1;

public class Homework_1 {
	public static void main (String[] args) {
		
	int bal =3;
		
		if(bal ==5) {
			System.out.println("«Отлично»");
		}else if(bal== 2) {
			System.out.println("«Неудовлетворительно»");
		}else  if(bal ==3) {
			System.out.println("«Удовлетворительно»");
		}else  if(bal== 4) {
			System.out.println("«Хорошо»");
		}else {
			System.out.println("«Некорректная оценка»");
		}
		int a =6;
		int b =3;
		int c =4;
		if(a%2==0||b%2==0||c%2==0||a%2==1||b%2==1||c%2==1) {
		
			System.out.println("true");
		}else {
			System.out.println("falce");
		}
		
		int age = 13;
		
		if(age >0||age>=12) {
			System.out.println("Ребёнок");
		}else if (age >13||age>=17) {
			System.out.println("Подросток");
		}else if(age >18||age>=59) {
			System.out.println("Взрослый");
		}else  if(age==60) {
			System.out.println("Пожилой");
		}else {
			System.out.println(" Ошибка");
		}
		
		
		
		int sum = 13;
		
		if(sum >90||sum>=100) {
			System.out.println("5");
		}else if (sum >75||sum>=89) {
			System.out.println("4");
		}else if(sum >60||sum>=74) {
			System.out.println("3");
		}else  if(sum >0||sum>=59) {
			System.out.println("2");
		}else {
			System.out.println(" Ошибка");
		}
		
		
		
		
	}
}
