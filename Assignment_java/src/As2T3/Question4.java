package As2T3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number ");
		int n=in.nextInt();
		System.out.println("The natural numbers until  "+n+"  are");
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
System.out.println("The sum of all "+n+" natural number is "+sum);
	}

}
