package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(35); //hs.put<35,PRESENT>
		hs.add(20); //hs.put<20,PRESENT>
		hs.add(28); // hs.put<28,PRESENT>
		
		hs.add(35);
		
		System.out.println(hs);
		
		
		
	}

}
