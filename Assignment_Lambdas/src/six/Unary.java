package six;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Unary {
 public static void main(String[] args) {
	 
	 ArrayList<String> array= new ArrayList<String>();
		array.add("Ram");
		array.add("Bunny ");
		array.add("Mahesh ");
		array.add("Prathyusha");
		UnaryOperator<String> operate= t-> t.toUpperCase();
		 array.replaceAll(operate);
		 System.out.println(array);
}
}
