package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(Comparator.reverseOrder());
		ts.add(24);
		ts.add(94);
		ts.add(2);
		ts.add(87);
		ts.add(76);
		ts.add(75);
		ts.add(63);
		
		System.out.println(ts);
	}

}
