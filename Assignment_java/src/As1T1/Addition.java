package As1T1;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers in the range of  1-10 to perform addition operation");
		int a=in.nextInt();
		int b=in.nextInt();
		if(((a>=1)&&(a<=10))&&((b>=1)&&(b<=10)))
		{
		int z=a+b;
		int result=z+30;
		System.out.println("The Result is:"+result);
		}
		else
		System.out.println("The value you have entered is not within the range");
		
	}
}
