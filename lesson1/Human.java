package lesson1;

public class Human implements Actions {
	private int maxRun;
	private int maxJump;
	
	public Human( int maxRun, int maxJump){
		this.maxRun = maxRun;
		this.maxJump = maxJump;
	}
	
	

	public boolean run(Treadmill treadmill) {
		System.out.println("Human is running");
		int length = treadmill.getLength();
		if (length <= maxRun) {
			System.out.println("Human was able to make this run");
			return true;
		} else {
			System.out.println("Human was not able to make this run");
			return false;
		}
	}

	public boolean jump(Wall wall) {
		System.out.println("Human is jumping");
		int height = wall.getHeight();
		if (height < maxJump) {
			System.out.print("Human was able to jump over");
			return true;
		} else {
			System.out.println("Human can't jump over");
			return false;
		}
	}

}
