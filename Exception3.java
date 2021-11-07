import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    long id;
    double balance=900;
    double withdraw;
    double deposit;
    
    Scanner sc= new Scanner(System.in);
    
   
		try {
			System.out.println("Enter withdraw amount");
			withdraw=sc.nextDouble();
			
			if(withdraw<balance) {
				System.out.println("successfully withdraw");
			}
			
			else {
				System.out.println("Enter correct amount");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
	}

}
