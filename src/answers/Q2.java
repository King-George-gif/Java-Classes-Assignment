package answers;

class Triangle{
	float side1, side2, side3;
	
	Triangle(){
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}
	
	float getPerimeter(){
		return side1 + side2 + side3;
	}
	
	float getArea() {
		return (side1*side2)/2;
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle1 = new Triangle();
		System.out.println("The area of the triangle is "+triangle1.getArea() + " units square");
		System.out.println("The perimeter of the triangle is "+triangle1.getPerimeter() + " units");

	}

}
