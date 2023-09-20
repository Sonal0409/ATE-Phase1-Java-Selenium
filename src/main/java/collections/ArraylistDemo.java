package collections;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Moscow");
		cities.add("Mumbai");
		
		// print the items in the list
		for (String t: cities)
		{
			System.out.println(t);
		}

		// print all the items in the Array list
		
		System.out.println(cities.size());
		
		// print items stored at an index in ArrayList
		
		System.out.println(cities.get(1));

		System.out.println(cities.get(2));
		
		// print the index of a value in arraylist
		

		System.out.println(cities.indexOf("Paris"));
		
		// Check if an item is in list or not
		
		System.out.println(cities.contains("Hyderabad")); // retursn false
		
		
	}

}
