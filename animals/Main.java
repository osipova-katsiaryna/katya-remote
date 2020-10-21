package animals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog(500, 0.5, 10);
		System.out.println("результат: run:" + " " + dog1.run(150));
		System.out.println("результат: swim:" + " " + dog1.swim(150));
		System.out.println("результат: jump:" + " " + dog1.jump(0.3));
		Dog dog2 = new Dog(400, 0.7, 10);
		Dog dog3 = new Dog(600, 0.4, 20);
		System.out.println("результат: run:" + " " + dog2.run(180));
		System.out.println("результат: swim:" + " " + dog2.swim(17));
		System.out.println("результат: jump:" + " " + dog2.jump(0.8));
		System.out.println("результат: run:" + " " + dog3.run(250));
		System.out.println("результат: swim:" + " " + dog3.swim(8));
		System.out.println("результат: jump:" + " " + dog3.jump(0.4));

		Cat cat1 = new Cat(200, 2);
		System.out.println("результат: run:" + " " + cat1.run(150));
		System.out.println("результат: swim:" + " " + cat1.swim(150));
		System.out.println("результат: jump:" + " " + cat1.jump(0.3));
		Cat cat2 = new Cat(300, 3);
		System.out.println("результат: run:" + " " + cat2.run(750));
		System.out.println("результат: swim:" + " " + cat2.swim(850));
		System.out.println("результат: jump:" + " " + cat2.jump(6.3));

	}

}
