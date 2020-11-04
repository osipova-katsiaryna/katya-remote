package lesson1;

public class Human implements Actions {
	private int maxRun;
	private int maxJump;
	
	public Human( int maxRun, int maxJump){
		this.maxRun = maxRun;
		this.maxJump = maxJump;
	}
	
	

	public void run(Treadmill treadmill) {
		System.out.println("Human is running");
		int length = treadmill.getLength();
		if (length <= maxRun) {
			System.out.println("Human was able to make this run");
		} else {
			System.out.println("Human was not able to make this run");
		}
	}

	public void jump(Wall wall) {
		System.out.println("Human is jumping");
		int height = wall.getHeight();
		if (height < maxJump) {
			System.out.print("Human was able to jump over");
		} else {
			System.out.println("Human can't jump over");
		}
	}

}
