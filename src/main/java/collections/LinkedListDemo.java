package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> cities = new LinkedList<>();
		

		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Moscow");
		cities.add("Mumbai");
		
		
		LinkedList cities2 = new LinkedList(cities);
		
		System.out.println(cities2.get(1));
		
		// print the items in the list
		for (String t: cities)
		{
			System.out.println(t);
		}

		// print all the items in the Linked list
		
		System.out.println(cities.size());
		
		// print items stored at an index in LinkedList
		
		System.out.println(cities.get(1));

		System.out.println(cities.get(2));
		
		// print the index of a value in Linkedlist
		

		System.out.println(cities.indexOf("Paris"));
		
		// Check if an item is in list or not
		
		System.out.println(cities.contains("Hyderabad")); // retursn false
		
		

	}

}
