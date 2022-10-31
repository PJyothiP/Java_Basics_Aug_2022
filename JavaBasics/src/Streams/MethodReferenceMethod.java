package Streams;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceMethod {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(15,20,3,5,12);
		/*for (Integer i : al) {
			System.out.println(i);
		}
		*/
		al.forEach(x->System.out.println(x));
		
		al.forEach(System.out::println);
	}

}
