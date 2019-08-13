package Assignment_2;

public class ShapeMain {
	public static void main(String[] args) {
		Triangle t = new Triangle(8, 15, 24);
		Circle c = new Circle(3);
		Rectangle r = new Rectangle(1, 8);
		
		t.findArea();
		t.findPerimeter();
		
		c.findArea();
		c.findPerimeter();
		
		r.findArea();
		r.findPerimeter();
		
	}
}