package As1T2;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any Number");
		int i=in.nextInt();
		if(i%2==0)
		{
			if((i>=2)&&(i<=5))
			{
				System.out.println("OLD");
			}
			else if((i>=6)&&(i<=30))
			{
				System.out.println("NEW");
			}
			else if(i>30)
			{
				System.out.println("OLD");
			}
		}
		else
		{
			System.out.println("NEW");
		}
	}

}
