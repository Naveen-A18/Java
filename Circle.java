package aitise3b;

public class Circle extends Shape1{
	double radius;
	
	Circle(){}
	
	Circle(double radius){
		this.radius = radius;
	}
	void calculateArea() {
		area = Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(5.0);
		
		c1.calculateArea();
		
		System.out.println("Area of the Circle: " + c1.area);

	}

}
