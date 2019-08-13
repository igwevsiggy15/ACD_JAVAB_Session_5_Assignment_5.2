package Assignment_2;

public class Circle extends Figure {
	
	private final double pi = Math.PI;
	private double rad;
	
	public Circle(double r){
		this.rad = r;
	}
	
	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle: " + (pi * Math.pow(rad, 2)));
	}

	@Override
	public void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Circle: " + (2 * pi * rad));
	}

}