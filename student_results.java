import java.util.Scanner;

public class student_results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int Subject1,Subject2,Subject3;
         
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter First Subject marks");
         Subject1=sc.nextInt();
         
         System.out.println("Enter Second Subject marks");
         Subject2=sc.nextInt();
         
         System.out.println("Enter Third Subject marks");
         Subject3=sc.nextInt();
         
         System.out.println("Result of Student is:");
         
         if(Subject1>=60 && Subject2>=60 && Subject3>=60) {
        System.out.println("Passed");
         }
         else if((Subject1>60 && Subject2>60)||(Subject1>60 && Subject3>60)||(Subject2>60 && Subject3>60)) {
        System.out.println("Pramoted");	 
         }
         
         else if(Subject1<60 && Subject2<60 && Subject3<60){
        	 System.out.println("Fail");	  
         }
        	 
         }


}
