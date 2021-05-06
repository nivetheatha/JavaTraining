package As3T6;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int real1,real2,imag1,imag2,option;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Real part of Complex number");
		real1=in.nextInt();
		System.out.println("Enter the Imaginary part of complex number");
        imag1=in.nextInt();
        System.out.println("Enter the Real part of Complex number");
		real2=in.nextInt();
		System.out.println("Enter the Imaginary part of complex number");
        imag2=in.nextInt();
        System.out.println("Choose the operation you want to perform");
        System.out.println("1.Addition  2.Subtraction  3.Multiplication");
        option =in.nextInt();
        Complex c=new Complex();
        switch(option)
        {
            case 1:
            	c.Addition(real1, imag1, real2, imag2);
            	break;
            case 2:
            	c.Subtraction(real1, imag1, real2, imag2);
            	break;
            case 3:
            	c.Multiplication(real1, imag1, real2, imag2);
            	break;
            default:
            	System.out.println("Invalid Option");
            	
        }
	}
	
	

}
