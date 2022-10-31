package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		//Integer Stream
		
		Stream.iterate(1, n->n+1).limit(10).forEach(System.out::println);
		System.out.println("--------------------------");
		Stream.iterate(1, n->n+1).limit(10).parallel().forEach(System.out::println);
		ParallelStreamDemo psd = new ParallelStreamDemo();
		System.out.println("is given number prime : "+psd.isPrime(28));
		
		long t1,t2;
		t1 = System.currentTimeMillis()/1000;
		
		long countOfPrime = Stream.iterate(1, n->n+1)
		.limit(1000000)
		.parallel()
		.filter(psd::isPrime)
		.peek(System.out::println)
		.count();
		
		t2 = System.currentTimeMillis()/1000;
		
		System.out.println("Count of Prime numbers between the range is : "+countOfPrime);
		System.out.println("The time consumed for processing is : "+(t2-t1));
		
		//Count of Prime numbers between the range is : 78498 and The time consumed for processing is : 95 -- > seq
		//Count of Prime numbers between the range is : 78498 and The time consumed for processing is : 45 --> parallel
	}
	public boolean isPrime(int num) {
		if(num<=1) return false;
		return !IntStream.rangeClosed(2, num/2).anyMatch(x->num%x == 0);
	}

}
