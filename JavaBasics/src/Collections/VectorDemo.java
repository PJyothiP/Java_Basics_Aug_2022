package Collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(13);
		v.add(43);
		v.add(35);
		v.add(35);
		
		System.out.println("The capacity of the vector is : "+v.capacity()+
				" and the size of vector : "+v.size());
	}

}
