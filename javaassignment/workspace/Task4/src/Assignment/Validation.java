package Assignment;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username = "Prathyusha";
		String password = "Reddy";

		Scanner scanner= new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the user name:  ");
			String login_name = scanner.nextLine();

			System.out.println("Enter the password:  ");
			String psw = scanner.nextLine();
			
			if(login_name.equals(username)) {
				if(psw.equals(password))
			
			{
				System.out.println("Welcome" + username);
				break;
			}
				else {
				System.out.println("try again");
			}
		}
		System.out.println("Contact Admin");

	}
	}

}
