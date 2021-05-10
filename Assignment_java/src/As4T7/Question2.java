package As4T7;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any String");
		String input=in.next();
		char[] arr=input.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int ch=findcount(input,arr[i]);
			if(ch==1)
			{
				System.out.println("The first non-repeated character in string is  "+arr[i]);
				break;
			}
			
		}
		

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
