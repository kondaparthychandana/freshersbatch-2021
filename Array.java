import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,i,x,flag = 0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the array elements");
       n=sc.nextInt();
       
       int a[]=new int[n];
       System.out.println("Enter value of array");       
       for(i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       
       System.out.println("enter Number you want to find");
       x=sc.nextInt();
       for(i=0;i<n;i++) {
    	   if(a[i]==x)
    	   {
    		   flag=1;
    		   break;
    	   }
    	   else
           {
               flag = 0;
           }
       }
       if(flag == 1)
       {
           System.out.println("Element found at position:"+(i + 1));
       }
       else
       {
           System.out.println("Element not found");
       }
      
	}

}
