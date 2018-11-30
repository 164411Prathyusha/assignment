package First;

public class Calculate {
 public static void main(String[] args) {
	Method add1=(num1,num2)->{
		return num1+num2;
	};
	Method sub1=(num1,num2)->{
		return num1-num2;
	};
	Method mul1=(num1,num2)->{
		return num1*num2;
	};
	Method div1=(num1,num2)->{
		return num1/num2;
	};
	
	Method m=(num1,num2)->{return 1;};
	 m.sub(9,2);
     System.out.println(add1.add(5,8));
     System.out.println(sub1.sub(5,8));
     System.out.println(mul1.mul(10,8));
     System.out.println(div1.div(8,8));
 }
}
