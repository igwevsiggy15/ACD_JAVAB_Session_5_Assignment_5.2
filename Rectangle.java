package Assignment_2;

public class Rectangle extends Figure{
	
	private double l, w;

	public Rectangle(double w, double l){
		this.w = w;
		this.l = l;
	}
	
	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of the Rectangle: " + (l *w));
		
	}

	@Override
	public void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of the Rectangle: " + (w*2 + l*2));
	}

}