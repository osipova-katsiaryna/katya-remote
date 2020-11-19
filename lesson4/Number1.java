package lesson4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        List<String> cities = Arrays.asList("Minsk", "Brest", "Homel", "Vitebsk", "Mogilev", "Grodno",
	              "Brest", "Minsk");
	        System.out.println("Исходный список городов Беларуси:");
	        cities.forEach(System.out::println);
	 
	        System.out.println("Города + количество повторений:");
	        Map<String, Integer> citiesCount = new HashMap<>();
	        for (String s : cities) {
	            citiesCount.put(s, citiesCount.getOrDefault(s, 0) + 1);
	        }
	        citiesCount.entrySet().forEach(System.out::println);
	 
	        System.out.println("Города без повторов: ");
	        Set<String> unique = new HashSet<>(cities);
	        unique.forEach(System.out::println);
	 
	    }

	}


