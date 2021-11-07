import java.util.Scanner;

public class Arithmatic_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    float c = 0;
	try {
		System.out.println("Enter First no.");
		int a=sc.nextInt();
		
		System.out.println("Enter Second no.");
		int b=sc.nextInt();
		
		c = a/b;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		 System.out.println("bye");
	}
    
    System.out.println("Division is"+c);
	

}
}
