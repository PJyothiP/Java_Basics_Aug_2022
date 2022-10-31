package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("Vassvik", 345);
		lhm.put("Shivansh", 3874);
		lhm.put("Yogi", 4857);
		lhm.put("Varshi", 879);
		
		System.out.println(lhm.entrySet());
	}

}
