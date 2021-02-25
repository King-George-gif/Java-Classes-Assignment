package answers;

class Rectangle{
	float length;
	float breadth;
	
	Rectangle(float a, float b){
		length = a;
		breadth = b;
	}
	
	float Area() {
		return length * breadth;
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(4, 5);
		Rectangle rectangle2 = new Rectangle(5,8);
		
		System.out.println("Area of rectangle1 is "+rectangle1.Area());
		System.out.println("Area of rectangle2 is "+rectangle2.Area());

	}

}
