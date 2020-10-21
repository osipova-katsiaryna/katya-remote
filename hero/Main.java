package hero;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomStep = new Random();
		Random randomMembrer = new Random();

		Hero[] team1 = new Hero[] { new Warrior(250, "Тигрил", 50, 0), new Assasin(150, "Акали", 70, 0),
				new Doctor(120, "Жанна", 0, 10) };

		Hero[] team2 = new Hero[] { new Warrior(290, "Минотавр", 60, 0), new Assasin(160, "Джинкс", 90, 0),
				new Doctor(110, "Зои", 0, 20) };
        int cnt = 0;
		while (!isDead(team1) && !isDead(team2) && cnt < 200) {
			cnt++;
			for (int i = 0; i < team1.length; i++) {
				
				int member = randomMembrer.nextInt(team1.length);
				if (randomStep.nextInt(2) == 0) {
					if (team1[i] instanceof Doctor) {
						team1[i].healing(team1[member]);
					} else {
						team1[i].hit(team2[member]);
					}
				} else {
					if (team2[i] instanceof Doctor) {
						team2[i].healing(team2[member]);
					} else {
						team2[i].hit(team1[member]);
					}
				}
				System.out.println("--------------");
			}
		}
		System.out.println("---------------");

		for (Hero t1 : team1) {
			t1.info();
		}

		for (Hero t2 : team2) {
			t2.info();
		}
	}

	public static boolean isDead(Hero[] hero) {
		int count = 0;
		for (int i = 0; i < hero.length; i++) {
			if (hero[i].health < 0) {

				count += 1;

				if (count == hero.length) {
					System.out.println(" All is dead");

					return true;

				}
			}

		}
		return false;
	}

}
