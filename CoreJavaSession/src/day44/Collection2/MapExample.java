package day44.Collection2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map m1=new HashMap();
		m1.put("key1", "admin");
		m1.put("key2", "admin2");
		m1.put(null, "admin123");
		
		System.out.println("Map Elements are : \n"+m1);
		
		System.out.println("Map element count: \n"+m1.size());

		System.out.println("Get the key value : \n"+m1.get("key2"));
		
		System.out.println("Key set of map : \n"+m1.keySet());
		
		System.out.println("Values of map : \n"+m1.values());
	
	}
}
/*
 * TO add any element in Map we need use put (key,value)
 * 	key and value both should be object
 * toString() is overrided here as well 
 * to get only keys from Map use getKeys()
 * to get only values from Map use values()
 * if you want get a particylar key value dn use get(Key) 
 */
