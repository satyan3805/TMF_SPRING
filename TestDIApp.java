
public class TestDIApp {

	public static void main(String[] args) {
		//direct object creation
		Triangle t = new Triangle();
		t.draw();
		
		Circle c = new Circle();
		c.draw();
		
		//through poly-morphisum
		Shape s1 =new Triangle();
		s1.draw();
		
		Shape s2 = new Circle();
		s2.draw();
		
		//through a method
		drawShape(s1);
		drawShape(s2);
		drawShape(t);
		drawShape(c);
		
		//DI
		ShapeDrawer shDraw = new ShapeDrawer();
		shDraw.setShape(t);
		shDraw.drawShape();

	}
	
	public static void drawShape(Shape sh) {
		sh.draw();
	}
}

interface Shape {
	public void draw();
	
}

class Triangle implements Shape{
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}


//Injecting Depedency
class ShapeDrawer{
	private Shape sh;
	
	public void setShape(Shape sh) {
		this.sh= sh;
	}
	
	public void drawShape() {
		this.sh.draw();
	}
}
