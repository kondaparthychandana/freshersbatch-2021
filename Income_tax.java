
import java.util.Scanner;
public class Income_tax
{
	public static void main(String args[])
	{
	double tax=0,CTC;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	CTC=sc.nextDouble();
	if(CTC<=180000)
		tax=0;
	else if(CTC<=300000)
		tax=0.1*(CTC-200000);
	else if(CTC<=500000)
		tax=(0.2*(CTC-300000))+(0.1*100000);
	else
		tax=((0.3*500000)+(0.2*200000)+(0.1*100000));
	System.out.println("Income tax amount is "+tax);
	}
}