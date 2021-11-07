import java.util.Scanner;
public class Student_AVG
{
    public static void main(String[] args) 
    {
        int n, total = 0, Average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of Students:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
        Average = total / n;
        System.out.println("Sum:"+total);
        System.out.println("Average:"+Average);
    }
}