package As1T2;

import java.util.Scanner;

public class BreakandContinue {
	public static void main(String[] args) {
	    System.out.println("Enter a positive or Negative integer");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		int result=positiveornegative(i);
		switch(result)
		{
		case 0:
			System.out.println("Its Over");
			break;
		case 1:
			System.out.println("Good going");
		}
	}
	static int positiveornegative(int v)
	{
		if(v<0)
		{
			return 0;
		    
		}
		else
			return 1;
	}

}
