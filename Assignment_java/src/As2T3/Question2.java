package As2T3;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		float sum=0;
		for(int i=1;i<=10;i++)
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the"+ i + "value");
			int j=in.nextInt();
			sum=sum+j;
		}
		
		System.out.println("The sum of all 10 numbers Entered "+sum);
		System.out.println("The avg of all 10 numbers Entered "+sum/10);
	}

}
