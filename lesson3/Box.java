package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
	private List<T> fruitList;

	public Box() {
		this.fruitList = new ArrayList<T>();
	}

	public void addFruit(T fruit) {
		this.fruitList.add(fruit);

	}

	public void printList() {
		for (int i = 0; i < fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
	}

	public double getWeight() {
		return this.fruitList.size() * this.fruitList.get(0).getWeight();
	}

	public boolean compare(Box box) {
		return this.getWeight() == box.getWeight();
	}

	public void moveAllFruits(Box<T> box1) {
		box1.fruitList = new ArrayList<T>();
		this.fruitList.addAll(box1.fruitList);
		System.out.print("New box contains");
	    this.printList();

	}

}
