package As1T2;

import java.util.Scanner;

public class Floatingno_identification {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any floating point Number");
		float i=in.nextFloat();
		if(i==0)
		{
			System.out.println("Zero");
		}
		else if(positiveornegative(i)==0)
		{
			System.out.println("Negative ");
		}
		else if(Math.abs(i)<1)
		{
			System.out.println("Small");
		}
		else if(i >1000000)
		{
			System.out.println("Large");
		}
		else
		{
			System.out.println("Positive ");
		}
	}
	static int positiveornegative(float i)
	{
		if(i<0)
		{
			return 0;
		    
		}
		else
		{
			 
			return 1;
		}
	}


}
