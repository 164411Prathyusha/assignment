package One;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
      aList2.add(new Transaction("birappa","Pune", 2011, 20000));
      aList2.add(new Transaction("prathyusha","Tirupati", 2018, 25000));
      aList2.add(new Transaction("bunny","Chittoor", 2016, 15000));
      aList2.add(new Transaction("mahesh","Pune", 2015, 30000));
     aList2.add(new Transaction("not exist", "null", 0, 0));
      aList2.add(new Transaction("Sahid Kapoor", "Delhi",2018, 80000));
      //2
      aList.stream()
      . sorted(Comparator.comparing(Fruits::getColor))
      .map(color->color.getName()+"-"+color.getColor())
      .forEach(System.out::println); 
      //3
      System.out.println("--------------------------------");
      aList.stream()
      .filter(s->s.getColor()=="Red")
      .forEach(System.out::println);
  	
		for(News n:aList1){
			System.out.println(n);
		}

 System.out.println("______________que.4________________");
 System.out.println(aList1.stream().max(Comparator.comparing(News::getCommentByUser)).get().getNewsId());
 
 
 System.out.println("______________que.5________________");
 long comment=aList1.stream().filter(str->str.getComment().contains("budget")).count();
 System.out.println("Occurence of budget in comment:"+comment);
 
 
 System.out.println("______________que.6________________");
 System.out.println(aList1.stream().max(Comparator.comparing(News::getComment)).get().getCommentByUser());
 
 
 
 System.out.println("______________que.7________________");
 Map<Object, Long> map = aList1.stream().collect(Collectors.groupingBy(i->i.getCommentByUser(), Collectors.counting())); 
 System.out.println("Comments by user"+map);

      //8
      System.out.println("--------------------------------");
      aList2.stream()
      .filter(t->t.getYear()==2011)
      .sorted(Comparator.comparing(Transaction::getValue))
      .forEach(System.out::println);
      
      //9
      System.out.println("--------------------------------");
      aList2.stream()
      .filter(c->c.getPlace()==c.getPlace())
      .forEach(System.out::println);
      //10
      System.out.println("--------------------------------");
      aList2.stream()
      .filter(p->p.getPlace()=="Pune")
      .sorted(Comparator.comparing(Transaction::getTrader))
      .forEach(System.out::println);
      //11
      System.out.println("--------------------------------");
      aList2.stream()
      .sorted(Comparator.comparing(Transaction::getTrader))
      .forEach(System.out::println);
      //12
      System.out.println("--------------------------------");
      aList2.stream()
     .filter(k->(k.getPlace().equals("Indore"))||(k.getPlace().equals("null")))
     .forEach(System.out::println);
      //13
      System.out.println("--------------------------------");
      aList2.stream()
      .filter(p->p.getPlace()=="Delhi")
          .sorted(Comparator.comparing(Transaction::getValue))
          .map(value->value.getPlace()+"-"+value.getValue())
          .forEach(System.out::println);
      //14
      System.out.println("--------------------------------");
      Transaction maxValue=aList2.stream()
      .max(Comparator.comparing(Transaction::getValue))
      .get();
      System.out.println("maxNumber = " + maxValue);
      //15
     System.out.println("--------------------------------");
      Transaction minValue=aList2.stream()
    		  .min(Comparator.comparing(Transaction::getValue))
    		  .get();
      System.out.println("minNumber = " + minValue);
      
      
      
    
      
      
      
      
      
      
      
 }
}

