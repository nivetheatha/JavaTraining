package As1T2;

import java.util.Scanner;

public class Divisible {
public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any Number");
		int i=in.nextInt();
		if(i%3==0)
		{
			if(i%5==0)
			{
				System.out.println("Consultadd JAVA Training");
			}
			else
			{
				System.out.println("Consultadd");
			}
		}
		else if(i%5==0)
		{
			System.out.println("JAVA Training");
		}
		else
		{
			System.out.println("The value you have entered is not divisible by 3 and 5");
		}
}
}
