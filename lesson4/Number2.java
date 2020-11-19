package lesson4;

import java.util.HashMap;
import java.util.HashSet;

public class Number2 {

	private HashMap<String, HashSet<String>> phoneBook = new HashMap<String, HashSet<String>>();

	public void add(String name, String phoneNumber) {
		if (this.phoneBook.get(name) == null) {
			this.phoneBook.put(name, new HashSet<String>());
		}

		this.phoneBook.get(name).add(phoneNumber);
	}

	public void getName(String name) {
		if (this.phoneBook.get(name) == null) {
			System.out.println("Абонент не найден");
		} else {
			System.out.println(name + " :" + this.phoneBook.get(name).toString());
		}
	}

	public void print() {
		this.phoneBook.entrySet().forEach(System.out::println);
	}

}
