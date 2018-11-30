package Third;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Function1 {
	public static void main(String[] args) {
		//predicate
		Predicate<String> name= p-> p.length()>10;
		String s="Wonderful";
		System.out.println(name.test(s));
		//consumer
		List<Integer> numerics= Arrays.asList(11,23,45,56,78,90);
		Consumer<List< Integer>> value=  num->{
			System.out.println(num);
		};
		value.accept(numerics);
		//supplier
		Supplier<String> array=()->"Hi Prathyusha";
		System.out.println(array.get());
		//function
		
		java.util.function.Function<Integer,String> convert=(number)->{
			
			return "hi";
		};
		System.out.println(convert.apply(12).length());
	
	}

}
