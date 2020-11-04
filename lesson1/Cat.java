package lesson1;

public class Cat implements Actions {

	public int maxRun;
	public int maxJump;

	public Cat(int maxRun, int maxJump) {
		this.maxRun = maxRun;
		this.maxJump = maxJump;
	}

	public boolean run(Treadmill treadmill) {
		System.out.println("Cat is running");
		int length = treadmill.getLength();
		if (length <= maxRun) {
			System.out.println("cat was able to make this run");
			return true;
		} else {
			System.out.print("cat was not able to make this run");
			return false;
		}
	}

	public boolean jump(Wall wall) {
		System.out.println("Cat is jumping");
		int height = wall.getHeight();
		if (height < maxJump) {
			System.out.print("Cat was able to jump over");
			return true;
		} else {
			System.out.println("Cat can't jump over");
			return false;
		}
	}

}
