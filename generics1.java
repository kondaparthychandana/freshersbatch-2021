import java.util.Iterator;
import java.util.HashSet;
public class generics1
{
	int id,Display_details;
    String name;
    int salary;
    String Department;
    
 
 
    String department;
 
    public Employee(String name, int rollNo, String Department)
    {
    	this.id = id;
        this.name = name;
        this.salary= salary;
        this.Department = Department;
    }
 
    @Override
    public int hashCode()
    {
        return id;
    }
 
    @Override
    public boolean equals(Object obj)
    {
    	Employee Employee = (Employee) obj;
 
        return (id == Employee.id);
    }
 
    @Override
    public String toString()
    {
        return id+", "+name+", "+salary+","+Department;
    }
}
 
public class generics1
{
    public static void main(String[] args)
    {
        HashSet<Employee> set = new HashSet<Employee>();
 
        //Adding elements to HashSet
 
        set.add(new Employee(121,"Avinash",5000,"ECE"));
 
        set.add(new Employee(101,"Bharat",8000,"EEE"));
 
        set.add(new Employee(151,"Malini",7000,"Civil"));
 
        set.add(new Employee(200,"Suresh",6000,"IT"));
 
     
        //Iterating through HashSet
 
        Iterator<Employee> it = set.iterator();
 
        while (it.hasNext())
        {
        	Employee Employee = (Employee) it.next();
 
            System.out.println(Employee);
        }
    }
}
