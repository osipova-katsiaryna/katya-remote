package lesson4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number2 myBook = new Number2();
		myBook.add("Ivanov", "678890909");
		myBook.add("Petrov", "123332");
		myBook.add("Sidorov", "12333992");
		myBook.add("Ivanov", "12333882");

		myBook.print();

		myBook.getName("Sidorov");
	}

}
