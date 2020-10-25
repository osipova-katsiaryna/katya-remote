package cats;

public class Cats {
	
	private String name;
    private int appetite;
    private boolean fed;
    
    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        boolean gotFood = p.decreaseFood(appetite);
        this.fed = this.fed || gotFood;
    }
    
	public boolean isFed() {
		return fed;
	}       
    
}
	
	
	
	
	


