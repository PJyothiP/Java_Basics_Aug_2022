package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(13);
		ll.add(56);
		ll.add(34);
		
		System.out.println("These are the elements of linked list : "+ll);
		
		for (Integer i : ll) {
			System.out.println("multipliying by 2: "+i*2);
		}
		
		ll.pop();
		System.out.println(ll);
		
		//ll.remove(1);
		
		/*for(int i = 0;i<ll.size();i++) {
			System.out.println("adding 10 :"+(ll.get(i)+10));
		}*/
		
	}

}
