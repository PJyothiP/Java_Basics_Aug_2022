package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		IntegerComparator ic = new IntegerComparator();
		Queue<Integer> pq = new PriorityQueue<Integer>(ic);
		pq.add(20);
		pq.add(13);
		pq.add(35);
		pq.add(15);
		pq.add(7);
		
		System.out.println(pq);
		
		System.out.println("-----------");
		
		for (Integer integer : pq) {
			System.out.println(integer);
		}
		
		System.out.println("------------------");
		
		while(pq.peek() != null) {
			System.out.println("This is the element that is to be processed "+pq.poll());
		}
	}

}
class IntegerComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 == o2) {
			return 0; //no swap
		}else if(o1>o2) {
			return 1; // swap 
		}else {
			return -1; // no swap
		}
	}
}

