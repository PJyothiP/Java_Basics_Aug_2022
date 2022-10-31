package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("Vass", 1234);
		hm.put("Shiv", 2345);
		hm.put("Yogi", 3456);
		hm.put("Varshi", 4567);
		hm.put(null, 3422);
		hm.put("Vass", 3999);
		
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm.get("Shiv"));
		
		System.out.println(hm.putIfAbsent("Shiva", 1234567));
		
		System.out.println(hm.entrySet());
		
		for (Entry<String,Integer> et : hm.entrySet()) {
			
			System.out.println("The key is : "+et.getKey()+ " and the value is : "+(et.getValue()*10));
			
		}
		
		
	}

}
