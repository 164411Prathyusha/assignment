package Second;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Class_order {
        public static void main(String[] args) {
			Order1 ab=(a)->{
				if(a>10000){
					
					System.out.println("Accept or completed");
					return true;
					
				}
				else {
				System.out.println("not accept");
				return false;
				}
			};
			System.out.println(ab.express(50000));
		}
}
