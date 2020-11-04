package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int h = 50;
		int l = 50;
		List<Actions> creatures = new ArrayList<Actions>();
		creatures.add(new Cat(30, 50));
		creatures.add(new Human(79, 67));
		creatures.add(new Robot(34, 67));

		

		List<Object> obstacles = new ArrayList<Object>();
		obstacles.add(new Wall(50));
		obstacles.add(new Treadmill(10));

		for (Actions act : creatures) {
			for (Object obs : obstacles) {
				if (obs instanceof Wall) {
					act.jump((Wall) obs);
				} else {
					act.run((Treadmill) obs);
				}
			}
		}

		// TODO Auto-generated method stub

	}

}
