package Seventh;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Map1 {
 public static void main(String[] args) {
	HashMap<Integer, String> obj= new HashMap<Integer, String>();
	obj.put(1,"ram");
	obj.put(2, "Prathyusha");
	obj.put(3, "bunny");
	//obj.entrySet();
     
	  StringBuilder k1=new StringBuilder();
	for(Map.Entry<Integer,String> entry:obj.entrySet()){
		k1.append(entry.getKey());
		k1.append(entry.getValue());
	}
	 System.out.println(obj);
  System.out.println(obj.entrySet());
	System.out.println(k1);
 }
}
