import java.util.Scanner;

public class Arithmatic_exception2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	    float c = 0;
		try {
			System.out.println("Enter First no.");
			int a=sc.nextInt();
			
			System.out.println("Enter Second no.");
			int b=sc.nextInt();
			
			c = a/b;
		} catch (ArithmeticException e) {
			
			// System.out.println("bye");
			e.addSuppressed(e);
		}
	    
	    System.out.println("Division is"+c);
	}

}
