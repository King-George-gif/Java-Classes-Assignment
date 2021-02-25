package answers;

import java.util.Scanner;

class Area{
	float length;
	float breadth;
	
	Area(float a, float b){
		length = a;
		breadth = b;
	}
	
	float returnArea() {
		return length * breadth;
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length and breadth of your rectangle respectively");
		
		float length = input.nextFloat();
		float breadth = input.nextFloat();
		input.close();
		
		Area rect1 = new Area(length, breadth);
		System.out.println("The area of your rectangle is "+rect1.returnArea() + " unit squared");

	}

}
