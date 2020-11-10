package lesson3;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Задача 2
		Orange orange = new Orange();
		Apple apple = new Apple();
		Apple app = new Apple();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Orange> orangeBox = new Box<Orange>();
		appleBox.addFruit(apple);
		orangeBox.addFruit(orange);
		appleBox.addFruit(app);
		appleBox.printList();

		Box<Apple> box3 = new Box<Apple>();
		appleBox.moveAllFruits(box3);

		System.out.println(appleBox.getWeight());
		System.out.println(orangeBox.getWeight());
		System.out.println(appleBox.compare(orangeBox));

		// Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
		String[] array = new String[] { "Milk", "Cow", "Grass" };
		Integer[] array1 = new Integer[] { 2, 4, 5, 6 };
		Method1 m = new Method1();
		Method1 m1 = new Method1();
		m.swap(array, 0, 2);
		m.swap(array1, 0, 3);
		System.out.println((Arrays.toString(array)));
		System.out.println((Arrays.toString(array1)));
	}

}
