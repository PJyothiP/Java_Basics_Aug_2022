package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(35);
		lhs.add(45);
		lhs.add(68);
		
		System.out.println(lhs);
		System.out.println(lhs.remove(45));
		System.out.println(lhs);
	}

}
