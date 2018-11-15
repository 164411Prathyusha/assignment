package Assignment;

public class Ams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 100 ; k <= 1000 ; k++) 
        { 
                   int num = k; 
                   int dis = 0; 
                   int set = 0;

                   while (num > 0) 
                    { 
                                dis = num % 10; 
                                set = set + (dis * dis * dis); 
                                num = num / 10; 
                    } 
                    if (k == set) 
                     { 
                                System.out.println ( k); 
                      } 
         } 

	}

}
