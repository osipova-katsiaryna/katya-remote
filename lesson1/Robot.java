package lesson1;

public class Robot implements Actions{
	private int maxRun;
	private int maxJump;
	
	public Robot( int maxRun, int maxJump){
		this.maxRun = maxRun;
		this.maxJump = maxJump;
	}
	

	public boolean run(Treadmill treadmill) {
		System.out.println("Robot is running");
		int length = treadmill.getLength();
		if (length <= maxRun) {
			System.out.println("Robot was able to make this run");
			return true;
		} else {
			System.out.print("Robot was not able to make this run");
			return false;
		}
	}

	public boolean jump(Wall wall) {
		System.out.println("Robot is jumping");
		int height = wall.getHeight();
		if (height < maxJump) {
			System.out.print("Robot was able to jump over");
			return true;
		} else {
			System.out.println("Robot can't jump over");
			return false;
		}
	}

}
