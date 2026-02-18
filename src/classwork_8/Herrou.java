package classwork_8;

public class Herrou {
	String name;
	int health;
	int strength;
	int level;

	public Herrou(String name, int health, int strength, int level) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.level = level;
	}

	public void attack() {
		System.out.println("Герой атакует с силой X");
	}

	public void takeDamage(int damage) {
		health -= damage;
	}

}