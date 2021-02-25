package answers;

import java.util.Scanner;

class Complex{
	float real;
	float imag;
	
	Complex(float a, float b){
		real = a;
		imag = b;
	}
	
	public static Complex sum(Complex a, Complex b) {
		return new Complex((a.real + b.real), (a.imag + b.imag));
	}
	
	public static Complex difference(Complex a, Complex b) {
		return new Complex((a.real - b.real), (a.imag - b.imag));
	}
	
	public static Complex product(Complex a, Complex b) {
		return new Complex((a.real*b.real), (a.imag*b.imag));
	}
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the real and imaginary of the first complex number respectively: ");
		float complex1_real = input.nextFloat();
		float complex1_imag = input.nextFloat();
		
		System.out.println("Enter the real and imaginary of the second complex number respectively");
		float complex2_real = input.nextFloat();
		float complex2_imag = input.nextFloat();
		
		input.close();
		
		Complex complex1 = new Complex(complex1_real, complex1_imag);
		Complex complex2 = new Complex(complex2_real, complex2_imag);
		
		System.out.println("Sum = "+Complex.sum(complex1, complex2).real + " + " + Complex.sum(complex1, complex2).imag +"i");
		System.out.println("Difference = "+Complex.difference(complex1, complex2).real + " + " + Complex.difference(complex1, complex2).imag +"i");
		System.out.println("Product = "+Complex.product(complex1, complex2).real + " + " + Complex.product(complex1, complex2).imag +"i");

	}

}
