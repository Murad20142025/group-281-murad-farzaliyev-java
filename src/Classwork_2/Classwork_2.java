package Classwork_2;

public class Classwork_2 {
	public static void main (String[] args) {
		int tem =20;
		
		if(tem>=15) {
			System.out.println("Ура! Можно играть на улице!");
		}else {
			System.out.println("Холодно, лучше остаться дома");
		}
		
		
		int candi =3;
		
		if(candi >5) {
			System.out.println("Ещё много конфет!");
		}else if (candi> 1) {
			System.out.println("Конфеты заканчиваются...");
		}else if(candi> 2) {
			System.out.println("Конфеты заканчиваются...");
		}else  if(candi> 3) {
			System.out.println("Конфеты заканчиваются...");
		}else  if(candi> 4) {
			System.out.println("Конфеты заканчиваются...");
		}else {
			System.out.println("Конфеты кончились 😢");
		}
		
		int leven =20;
		if (leven>= 20) {
			System.out.println("Ты профи!");
		}else if(leven>= 10) {
			System.out.println("Отличный игрок!");
		}else  if(leven>=5) {
			System.out.println("Хорошее начало!");
		}else {
			System.out.println("Новичок, продолжай играть!");
		}
		
		
		int mon =300;
		int toymon=250	;	
		if(mon>=toymon) {
			System.out.println("Ура! Покупаю игрушку!");
		}else {
			System.out.println("Не хватает денег... Нужно подкопить");
		}
		
		int stars =8;
		if (stars>= 10) {
			System.out.println("Красивый звёздное небо!");
		}else if(stars>= 5||stars>=9) {
			System.out.println("Неплохо, но можно добавить");
		}else  if(stars>=5) {
			System.out.println("Добавь ещё звёзд!");
		}
	}
}
