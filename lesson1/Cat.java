package lesson1;

public class Cat implements Actions {

	public int maxRun;
	public int maxJump;

	public Cat(int maxRun, int maxJump) {
		this.maxRun = maxRun;
		this.maxJump = maxJump;
	}

	public void run(Treadmill treadmill) {
		System.out.println("Cat is running");
		int length = treadmill.getLength();
		if (length <= maxRun) {
			System.out.println("cat was able to make this run");
		} else {
			System.out.print("cat was not able to make this run");
		}
	}

	public void jump(Wall wall) {
		System.out.println("Cat is jumping");
		int height = wall.getHeight();
		if (height < maxJump) {
			System.out.print("Cat was able to jump over");
		} else {
			System.out.println("Cat can't jump over");
		}
	}

}
