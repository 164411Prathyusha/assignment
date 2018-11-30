package five;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Fifth {
   public static void main(String[] args) {
	ArrayList<String> array= new ArrayList<String>();
	array.add("Ram");
	array.add("Bunny ");
	array.add("Mahesh ");
	array.add("Prathyusha");
	Consumer<ArrayList<String>> consum= (word)->{
	StringBuilder work= new StringBuilder();
	for (String string1 : word) {
		work.append(string1.charAt(0));
	}
	System.out.println(work);
	};
	
		consum.accept(array);
	
	
}
}
