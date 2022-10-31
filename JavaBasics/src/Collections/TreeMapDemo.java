package Collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> tm = new TreeMap<Integer,String>(Comparator.reverseOrder());
		tm.put(23, "Vassvik");
		tm.put(15,"Teja");
		tm.put(45,"Vyshnavi");
		System.out.println(tm.entrySet());
		
		
		Map<String,Integer> tms = new TreeMap<String,Integer>();
		tms.put("Vassvik", 34);
		tms.put("Shiva", 454);
		tms.put("Yognavi", 345);
		tms.put("Varshi", 978);
		tms.put("varshi", 89);
		tms.put("isha", 983);
		
		
		System.out.println(tms.entrySet());
	}

}
