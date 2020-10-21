package hero;

import java.util.Random;

class Assasin extends Hero {

	int cricitalHit;
	Random random = new Random();

	public Assasin(int heal, String name, int damage, int addHeal) {
		super(heal, name, damage, addHeal);
		this.cricitalHit = random.nextInt(20);
	}

	@Override
	void hit(Hero hero) {
		if (hero != this) {
			if (health < 0) {
				System.out.println("Герой " + this.name+ " погиб и бить не может!");
			} else {
				System.out.println(this.name + " бьет " + hero.name);
				hero.causeDamage(damage + cricitalHit);
			}
			
		}
	}

	@Override
	void healing(Hero hero) {
		System.out.println("Убийцы не умеют лечить! " + this.name);
	}
}
