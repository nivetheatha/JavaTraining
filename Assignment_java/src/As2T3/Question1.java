package As2T3;

import java.util.Scanner;

public class Question1{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number to find its multiplication table");
		int i=in.nextInt();
		for(int j=1;j<=10;j++)
		{
			System.out.println(i+"*"+j+"="+i*j);
		}
	}

}
