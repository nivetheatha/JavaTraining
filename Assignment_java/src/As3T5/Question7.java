package As3T5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		String s="heLLo WOrLd";
		String words[] = s.split(" ");
	      for(String token : words) {
	      	upper_lower(token);
	      	System.out.print("  ");
	      }
		   
	}
	
	static void upper_lower(String str)
	{
		char[] c =str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
	  
		 boolean b=Character.isUpperCase(c[i]);
		 if(b==true)
		 {
			 System.out.print(Character.toLowerCase(c[i]));
		 }
		 else
		 {
			 System.out.print(Character.toUpperCase(c[i]));
		 }
	    }
	}

}
