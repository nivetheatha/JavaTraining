package As2T3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three numbers to find its increasing or decreasing");
		System.out.println("Enter the first number");
		int a=in.nextInt();
		System.out.println("Enter the second number");
		int b=in.nextInt();
		System.out.println("Enter the Third number");
		int c=in.nextInt();
		if((a<b)&&(b<c))
		{
		System.out.println("INCREASING");	
		}
		else if((a>b)&&(b>c))
		{
		System.out.println("DECREASING");	
		}
		else
		{
			System.out.println("Neither Increasing nor decreasing");
		}
	}

}
