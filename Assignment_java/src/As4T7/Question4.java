package As4T7;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any String");
		String input=in.next();
		char[] arr=input.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int ch=findcount(input,arr[i]);
			if(ch!=1)
			{
				System.out.println("The string you entered doesnt have unique characters");
				System.exit(0);
				
			}
			
		}
		System.out.println("The string you entered have unique characters");

	}
	
	
	 static int findcount(String s,char c)
	{ 
	  int cnt =0;
		for(int j=0;j<s.length();j++)
		{
	        
			if(s.charAt(j)==c)
           {
				cnt++;
		   }
	
		}
		return cnt;

	}
	 
	}


