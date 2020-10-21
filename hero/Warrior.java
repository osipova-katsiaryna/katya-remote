package hero;

class Warrior extends Hero {

	public Warrior(int health, String type, int damage, int addHeal) {
		super(health, type, damage, addHeal);
	}

	@Override
	void hit(Hero hero) {
		if (hero != this) {
			if (health < 0) {
				System.out.println("Воин " + this.name + " бить не может. dead.");
			} else {
				System.out.println(this.name + " бьет " + hero.name);
				hero.causeDamage(damage);
			}
			
		}
	}

	@Override
	void healing(Hero hero) {
		System.out.println("Войны не умеют лечить! " + this.name);
	}
}
