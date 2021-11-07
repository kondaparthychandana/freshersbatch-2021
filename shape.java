abstract class Shapes{
	abstract void draw();
}

class line extends Shapes{
	void draw() {
		System.out.println("Draw lines");
	}
}

class Rectangle extends Shapes{
	void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Cube extends Shapes{
	void draw() {
		System.out.println("Draw Cube");
	}
}
public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shapes s;
     s=new line();
     s.draw();
     
     s=new Rectangle();
     s.draw();
     
     s=new Cube();
     s.draw();
	}

}
