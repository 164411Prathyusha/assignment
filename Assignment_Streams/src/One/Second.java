package One;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Second {
 public static void main(String[] args) {
	List<Fruits> aList=new ArrayList<Fruits>();
	  aList.add(new Fruits("appe",150,250,"Red")); 
      aList.add(new Fruits("orange",120,150,"orange")); 
      aList.add(new Fruits("Grape",80,120,"Green")); 
      aList.add(new Fruits("Mango",110,70,"Yellow"));
      List<News> aList1=new ArrayList<News>();
	  aList1.add(new News(123,"Me","Good","Average")); 
      aList1.add(new News(234,"You","Excellent","Average")); 
      aList1.add(new News(345,"","","")); 
      aList1.add(new News(457,"","",""));
      List<Transaction> aList2= new ArrayList<Transaction>();
      aList2.add(new Transaction("birappa", 2011, 20000));
      aList2.add(new Transaction("prathyusha", 2018, 25000));
      aList2.add(new Transaction("Bunny", 2016, 15000));
      aList2.add(new Transaction("mahesh", 2015, 30000));
      
      //2
      aList.stream()
      . sorted(Comparator.comparing(Fruits::getColor))
      .map(color->color.getName()+color.getColor())
      .forEach(System.out::println); 
      //3
      System.out.println("--------------------------------");
      aList.stream()
      .filter(s->s.getColor()=="Red")
      .forEach(System.out::println);
      //8
      aList2.stream()
      .filter(t->t.getYear()==2011)
      .sorted(Comparator.comparing(Transaction::getValue))
      .forEach(System.out::println);
      
      

 }
}
