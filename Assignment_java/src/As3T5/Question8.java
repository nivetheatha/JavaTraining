package As3T5;

import java.util.Scanner;
import java.util.Stack;

public class Question8 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  Stack<Integer> stack = new Stack<Integer>();
		   System.out.println("Please enter your expression.");
		    String exp = in.next();
		    for(int i=0;i<exp.length();i++)
		    { char ch = exp.charAt(i);
		      if (ch == '(' || ch == '[' || ch == '{' )
		          stack.push(i);
		      else if (ch == ')'|| ch == ']' || ch == '}')
		      {
		        
		        if(stack.isEmpty())
		        {  
		        
		          System.out.println("False");
		          System.exit(0);
		        }
		        else 
		        { 
		        	 stack.pop();
		        } 

		      }            
		      
		    	
		    }
		    
		    if (stack.isEmpty())
		    {
		    	 System.out.println("True");
		    }
		    else
		    {
		    	 System.out.println("False");
		    }
		    

	}
	


}
