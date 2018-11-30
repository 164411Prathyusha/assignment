package First;

public interface Method {
         int add(int num1,int num2);
          default int sub(int num1,int num2){
			return num2-num1;  
        	  
          }
     default int mul(int num1,int num2){
    	 return num1*num2;
        	   }
     default int div(int num1,int num2){
    	 return num1/num2;
   	 }
}
