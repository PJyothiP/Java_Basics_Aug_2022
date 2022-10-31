package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		String[][] str = {{"This", "is"},
						  {"demo","class"},
						  {"My","First"}};
		
		List<String[]> li = Arrays.asList(str);
		for (String[] strings : li) {
			System.out.println(Arrays.toString(strings));
		}
		
		List<String> alfinal = li.stream().flatMap(x->Arrays.stream(x)).map(x->x.concat(" Welcome ")).collect(Collectors.toList());
		System.out.println(alfinal);
	}

}
