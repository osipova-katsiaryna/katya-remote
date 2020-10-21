package hero;

class Doctor extends Hero {

	public Doctor(int heal, String name, int damage, int addHeal) {
		super(heal, name, damage, addHeal);
	}

	@Override
	void hit(Hero hero) {
		System.out.println("Доктор не может бить!  " + this.name);
	}

	@Override
	void healing(Hero hero) {
		if (hero.getHealth() <= 0) {
			System.out.println("Hero dead, can't be healed. " + hero.name);
			return;
		}
		if (this.health <= 0) {
			System.out.println(" dead " + this.name);
			return;
		}
		hero.addHealth(addHeal);
		System.out.println(this.name + " полечил " + hero.name + " : " + hero.getHealth());
	}
}
