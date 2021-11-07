import java.lang.String;
public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /**Quetion1*/
		
		 String s="Hello World";
      
      int a=s.length();
      System.out.println("length is " +a);
      
      /**Quetion2*/
       
       
      
	  String B1="Hello";
     
      
       B1=B1.concat(" How are you");
       
       System.out.println(B1);
       
       
       /**Quetion3*/
       
       String str1="Java String pool refer a collection of string which are store in heap memory";
       str1=str1.toLowerCase();
       System.out.println(str1);
       
       str1=str1.toUpperCase();
       System.out.println(str1);
       
       str1=str1.replace("A", "$");
       System.out.println(str1);
       System.out.print(str1.contains("COLLECTION"));
       
       
       
       
	}

}
