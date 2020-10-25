package cats;

public class Plate {

	private int food;

	public Plate(int food) {
		this.food = food;
	}
	
	public int getFood(){
		return this.food;
	}
	public void setFood(int food){
		this.food = food;
	}

	public boolean decreaseFood(int n) {
		if (n > food) {
			System.out.println("Not enough food");
			return false;			
		} else {
			food -= n;
			return true;
		}

	}
	public void addFood(int extraFood) {
		food+=extraFood;
	}

	public void info() {
		
		System.out.println("plate: " + food);
	}

}
