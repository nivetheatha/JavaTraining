package As4T7;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any String");
		String input=in.next();
		System.out.println("The Reverse of the string will be");
		for(int i=(input.length()-1);i>=0;i--)
		{
			System.out.print(input.charAt(i));		
		}

	}

}
