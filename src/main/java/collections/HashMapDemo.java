package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> td = new HashMap<>();
		
		td.put("Ram", 12345);  // storing kay and value
		td.put("Marc", 35345);
		td.put("John", 5345);
		td.put("Jaya", 5345);
		td.put("James", 34535);
		
		// print the values of the Hash map
		// it retrievs all the values but doesnot maintain sequence
		// duplicate values not allowed
		
		for(Entry m: td.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		

	}

}
