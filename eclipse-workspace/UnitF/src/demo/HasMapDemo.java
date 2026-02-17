package demo;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put("Raman", 3424);
		phoneBook.put("Vipin", 8424);
		phoneBook.put("Ajay", 36724);
		phoneBook.put("Sumit", 9424);  //where key value present only there use hashmap
		
		System.out.println(phoneBook);
		System.out.println(phoneBook.get("Vipin"));
		for(String key: phoneBook.keySet()) {
			System.out.println(phoneBook.get(key));
		}
		
		
		for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	
	}

}
