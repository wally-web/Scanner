import java.util.Scanner;

public class LetsTryScann {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter the first name");
		String firstName = scan.nextLine();
		
		System.out.println("Enter second name");
		String secondName = scan.nextLine();
		
		
		System.out.println("Your team members are: ");
		
		System.out.println(firstName);
		
		System.out.println(secondName);
		
		
		System.out.println("Enter the first value");
		int a = scan.nextInt();
		
		System.out.println("Enter the second value");
		int b = scan.nextInt();
		
		System.out.println("The total is");
		System.out.println(a + b);
		
		//Close your scanner so you will not have  "Resource leak: 'scan' is never closed"
		scan.close();
		
	}

}
