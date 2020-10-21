package animals;

public abstract class Animals {
	
	private int maxL;
	private double maxHeight;
	private int maxSwim;

	public Animals(int maxL, double maxHeight, int maxSwim) {
		this.maxL = maxL;
		this.maxHeight = maxHeight;
		this.maxSwim = maxSwim;
	}
	public Animals(int maxL, double maxHeight) {
		this.maxL = maxL;
		this.maxHeight = maxHeight;
		
	}

	public boolean run(int l) {
		return l <= this.maxL;
	}

	public boolean swim(int swimL) {
		return swimL <= this.maxSwim;

	}

	public boolean jump(double h) {
		return h <= this.maxHeight;
	}

}
