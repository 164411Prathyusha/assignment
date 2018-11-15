package Assignment;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=153,n,rem, res=0;
     n=num;
     while(n!=0){
    	 rem=n%10;
    	 res+= Math.pow(rem, 3);
    	 n=n/10;
     }
     if(res==num)
    	 System.out.println("Is Amstrong"+num);
     else
    	 System.out.println("Is not Amstrong"+num);
     
    	 
	}

}
