abstract class Persistence{
	abstract void persist();
}

class FilePersistence extends Persistence{

	@Override
	void persist() {
		// TODO Auto-generated method stub
		System.out.println("Per File");
	}
	
}

class DatabasePersistence extends Persistence{

	@Override
	void persist() {
		// TODO Auto-generated method stub
		
		System.out.println("Per Database");
		
	}
	
}
public class persistant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence pobj;
		pobj=new DatabasePersistence();
		pobj.persist();
		
		pobj=new FilePersistence();
		pobj.persist();
		
	}

}
