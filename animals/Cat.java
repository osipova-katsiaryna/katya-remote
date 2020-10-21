package animals;

public class Cat extends Animals {

	public Cat(int maxLenghth, double maxHeight) {
		super(maxLenghth, maxHeight);
	}

	@Override
	public boolean swim(int l) {
		System.out.println("Cats dont sweem");
		return false;

	}

}
