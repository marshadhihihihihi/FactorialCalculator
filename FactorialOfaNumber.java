import java.util.Scanner;
public class FactorialOfaNumber {

	public static int factorial (int num) {
		if (num == 0) {
			
			return 1;
		}

		int factorial = 1;

		for (int i = 1; i <= num ; i++) {
			
			factorial *= i;
			
		} 
				
		return factorial;

	}	

	public static void main (String...args) {

	Scanner sc = new Scanner (System.in) ;
	String continueProgram;

	do {

	System.out.print ("Enter a number to see factorial of that number : ");
	int input = sc.nextInt ();

	System.out.print ("Factorial of this number is : " +factorial(input));
	System.out.println ();
	System.out.println ();

	System.out.print ("If you want to re-enter a number type (y) Or to terminate this program type (n) : ");
	continueProgram = sc.next(); 
	
	System.out.println ();

	} while (continueProgram.equalsIgnoreCase("y"));

	System.out.println ("Thank you for using our service!");

	
  }
}


	
