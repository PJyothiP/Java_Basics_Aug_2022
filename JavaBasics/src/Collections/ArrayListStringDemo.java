package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListStringDemo {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Vassvik");
		li.add("Shivansh");
		li.add("Yognavi");
		li.add("Varshi");
		
		ListIterator<String> lit = li.listIterator(li.size());
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		li.removeIf(x->x.contains("v"));
		System.out.println(li);
		
	}

}
