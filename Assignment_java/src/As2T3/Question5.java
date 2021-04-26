package As2T3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		int d=0;
		long sum=0l;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any long value");
		long l=in.nextLong();
		while(l>0)
		{
		 d=d+1;
		 sum=sum+(l%10);
		 l=l/10;
		 
		}
		System.out.println("The number of digits present in the value entered:   "+d);
		System.out.println("The sum of all digits will be:  "+sum);


	}

}
