package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		ht.put(10, 2345);
		ht.put(23, 276854);
		ht.put(34, 32874832);
		
		ht.put(10, 24454);
		
		System.out.println(ht.entrySet());
		System.out.println(ht.replace(23, 276854, 45));
		System.out.println(ht.entrySet());
	}

}
