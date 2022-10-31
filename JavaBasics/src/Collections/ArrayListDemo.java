package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//declare a collection
		List<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		//add elements to collection
		al.add(10);
		al.add(15);
		al.add(12);
		al.add(13);
		al.add(25);
		
		//iterate through collection elements
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		al.sort(Comparator.naturalOrder());
		System.out.println(al+"after sort");
		
		//iterate in reverse order
		
		System.out.println("------------------------------");
		
		ListIterator<Integer> lit = al.listIterator(al.size());
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		
		System.out.println("The size of the arraylist : "+al.size());
		//use addall
		l.addAll(al);
		l.add(23);
		System.out.println("The elements of l arraylist are  : "+l);
		
		//convert to array
		Object[] obj = al.toArray();
		System.out.println(obj.length);
		System.out.println(obj[3]);
		
		System.out.println("The third element of the collection is : "+al.get(2));
		l.remove(0);
		
		System.out.println("The elements of l arraylist after removing first element : "+l);
		
		l.removeAll(al);
		System.out.println("The elements of l arraylist after removeAll : "+l);
		
		al.removeIf(x->x>15);
		System.out.println("The elements of al after removeIf : "+al);
		
		al.add(23);
		al.retainAll(l);
		System.out.println("the elements of al after retainAll : "+al);
		l.add(16);
		
		if(al.equals(l)) {
			System.out.println("Both the collections are equal");
		}else {
			System.out.println("Collections are different");
		}
		
		
		al.add(45);
		if(l.containsAll(al)) {
			System.out.println("l contains al");
		}else {
			System.out.println("l doesnot contain al");
		}
		
		al.clear();
		System.out.println("elements of al after clear "+al);
		
		System.out.println(al.get(0));
		
	}

}
