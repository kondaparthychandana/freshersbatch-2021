public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuilder build= new StringBuilder("String");
     
     build=build.append("  is a peer class of string ");
     
     build.append("that provides much of");
     
     build.append("the functionality of string");
     
     System.out.println(build);
     
  
//Question2
     
     StringBuilder sb2=new StringBuilder("It is used to at the specified index position");
     sb2.insert(14, "Insert text ");
     System.out.println(sb2);
    
     //Question3
     StringBuilder sb3=new StringBuilder("This method return the reversed object which was called");
     sb3.reverse();
     System.out.println(sb3);
     
	}

}
