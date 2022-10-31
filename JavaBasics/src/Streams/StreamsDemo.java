package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(15,3,67,82,9,48);
		List<Integer> alFinal = al.stream().filter(x->x>10).sorted(Comparator.naturalOrder()).map(x->x*5).collect(Collectors.toList());
		System.out.println(alFinal);
		
		al.stream().filter(x->x<10).map(x->x+10).forEach(System.out::println);
		
		List<String> sld = Arrays.asList("Shivansh","Vassvik","Yogi","Varshi");
		sld.stream().filter(x->x.length()>4).sorted(Comparator.reverseOrder()).map(x->x.concat(" Welcome")).forEach(System.out::println);
		
		System.out.println(sld.stream().anyMatch(x->x.matches("Yogi")));
		
		System.out.println(Arrays.asList("a1","b12","c123","d12").stream().map(x->x.substring(1, x.length())).mapToInt(Integer::parseInt).max());
		
		int[] i = {10,3,5,29,14};
		
		Supplier<IntStream> supp = () -> IntStream.of(i);
		
		supp.get().max().ifPresent(System.out::println);
		
		supp.get().min().ifPresent(System.out::println);
		
		
		
		String s = "1234";
		System.out.println(Integer.parseInt(s));
		
		
	
	}

}
