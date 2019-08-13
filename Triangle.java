package Assignment_2;

public class Triangle extends Figure{

	private double sideA, sideB, sideC;

	public Triangle(double a, double b, double c){
		this.sideA = a;
		this.sideB = b;
		this.sideC = c;
	}
	
	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		double p = (sideA + sideB + sideC) / 2;
		System.out.println("The area of Triangle: " + Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)));
	}

	@Override
	public void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of a Triangle: " + (sideA + sideB + sideC));
	}
	
}