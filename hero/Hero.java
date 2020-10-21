package hero;

import java.util.Random;

abstract class Hero {

	protected int health;
	protected String name;
	protected int damage;
	protected int addHeal;

	public Hero(int health, String name, int damage, int addHeal) {
		this.health = health;
		this.name = name;
		this.damage = damage;
		this.addHeal = addHeal;
	}

	abstract void hit(Hero hero);

	abstract void healing(Hero hero);

	void causeDamage(int damage) {
		if (health > 0) {
			health -= damage;
		}
		
		if (health < 0) {
			System.out.println("Герой " + this.name + " мертвый!");
		} else {
			System.out.println("Героя ударили " + this.name + " : " + this.health);
		}
	}

	public int getHealth() {
		return health;
	}

	void addHealth(int health) {
		this.health += health;
	}

	void info() {

		System.out.println(name + " " + (health < 0 ? "Герой мертвый" : health) + " " + damage);
	}

}
