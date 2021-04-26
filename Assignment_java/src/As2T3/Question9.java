package As2T3;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		int c=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=in.nextInt();
		while(c<=a)
		{
			
			for(int i=1;i<=c;i++)
			{
				
				System.out.print(i);
				
			}
			c=c+1;
			System.out.println();
		}

	}

}
