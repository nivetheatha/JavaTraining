package As1T1;

import java.util.Scanner;

public class GettingInputfromtheUser {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the boolean value");
		boolean b=in.nextBoolean();
		System.out.println("Enter the integer value");
		int i=in.nextInt();
		System.out.println("Enter the character value");
		char c=in.next().charAt(0);
		System.out.println("Enter the string value");
		String s= in.next();
		System.out.println("Enter the float value");
		float f=in.nextFloat();
		System.out.println("Enter the double value");
		double d=in.nextDouble();
		System.out.println("The value Entered are below:");
		System.out.println("Boolean value : "+b +"\nInteger Value:  "+  i  +"\nCharacter value:    "+c   +"\nString value:    "+ s +"\nFloat value:    "+  f +"\nDouble value:  "+ d);
			}
}
