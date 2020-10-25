package cats;

public class Main {
		    public static void main(String[] args) {
	        Cats cat = new Cats("Barsik", 500);
	        Plate plate = new Plate(100);
	        plate.info();
	        cat.eat(plate);
	        System.out.println(cat.isFed());
	        plate.info();
	        plate.addFood(40);
	        plate.info();
	        Cats []catt = new Cats[3];
	        catt[0] = new Cats("Bob", 20);
	        catt[1] = new Cats("Tom", 25);
	        catt[2] = new Cats("Lis", 10);
	        for(int i=0; i<catt.length; i++){
	        catt[i].eat(plate);
	        System.out.println(catt[i].isFed());
	        
	        }
		    }
	    }
	


