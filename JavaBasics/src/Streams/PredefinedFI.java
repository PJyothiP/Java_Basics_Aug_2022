package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Consumer;

public class PredefinedFI {

	public static void main(String[] args) {
		//Function interface
		Function<Integer,Integer> f = x->x*10;
		System.out.println("the output of the function interface is "+f.apply(5));
		Function<String,Integer> fs = x->x.length();
		
		//Binary interface
		BinaryOperator<Integer> bo = (a,b) -> a*b;
		System.out.println("the output of the binary operator interface is : "+bo.apply(10, 30));
		BinaryOperator<String> bos = (x,y) -> x.concat(y);
		System.out.println("The output of binaryoperator interface for strings is : "+bos.apply("Vassvik ", " Shivansh"));
		BiFunction<Integer,Integer,Double> bifunction = (a,b) ->a*b+7.8;
		System.out.println("the output of bifunction is : "+bifunction.apply(10, 20));
		BiFunction<String,String,Integer> bifunctionStr = (a,b)-> a.concat(b).length();
		System.out.println("the output of bifunction for strings is : "+bifunctionStr.apply("Demo", "Dummy"));
		
		System.out.println("The output of andThen is : "+bos.andThen(fs).apply("Selenium", "Session"));
		
		//Unary Operator
		
		UnaryOperator<String> uo = x->x.toUpperCase();
		System.out.println("The uppper case for the string is : "+uo.apply("vassvik"));
		UnaryOperator<Integer> uo1 = x->x*5;
		System.out.println("The output of integer unaryoperator is "+uo1.apply(30));
		
		//predicate
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(12);
		li.add(39);
		li.add(20);
		li.add(15);
		li.add(29);
		li.add(30);
		
		li.addAll(Arrays.asList(9,6,48));
		System.out.println(li);
		Predicate<Integer> p = (x)->x>15;
		li.removeIf(p.negate());
		System.out.println(li);
		
		List<String> lis = Arrays.asList("Vassvik","Shivansh");
		System.out.println(lis);
		
		lis.replaceAll(uo);
		System.out.println(lis);
		
		//Consumer
		
		Consumer<Integer> co = x->System.out.println(x);
		co.accept(20);
		
		li.forEach(co);
		
		//Supplier
		
		Supplier<String> sf = ()->"Vassvik";
		System.out.println(sf.get().length());
		
		Supplier<Long> sf1 = ()->System.currentTimeMillis();
		
		System.out.println("The system time is : "+sf1.get());
		
		
	}

}
