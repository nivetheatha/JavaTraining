package As1T2;

import java.util.Scanner;

public class Arithmetic_Operation {
	static float result;
	public static void main(String[] args) {
	float first,second;
	System.out.println("Choose the number to perform the following Arithmetic operation");
	System.out.println("Additon --> 1");
	System.out.println("Subtraction --> 2");
	System.out.println("Division --> 3");
	System.out.println("Multiplication --> 4");
	System.out.println("Average --> 5");
	Scanner in=new Scanner(System.in);
	int i=in.nextInt();
	switch(i) {
	  case 1:
	    System.out.println("Enter the first variable");
	    first=in.nextFloat();
	    System.out.println("Enter the second variable");
	    second=in.nextFloat();
	    result=first+second;
	    positiveornegative(result);
	    break;
	  case 2:
		  System.out.println("Enter the first variable");
		  first=in.nextFloat();
		  System.out.println("Enter the second variable");
		  second=in.nextFloat();
		  result=first-second;
		  positiveornegative(result);
		  break;
	    
	  case 3:
		    System.out.println("Enter the first variable");
		    first=in.nextFloat();
		    System.out.println("Enter the second variable");
		    second=in.nextFloat();
		    result=first/second;
		    positiveornegative(result);
		    break;
	  case 4:
		    System.out.println("Enter the first variable");
		    first=in.nextFloat();
		    System.out.println("Enter the second variable");
		    second=in.nextFloat();
		    result=first*second;
		    positiveornegative(result);
		    break;
	  case 5:
		    System.out.println("Enter the first variable");
		    first=in.nextFloat();
		    System.out.println("Enter the second variable");
		    second=in.nextFloat();
		    System.out.println("Enter the third variable");
		    float first1=in.nextFloat();
		    System.out.println("Enter the fourth variable");
		    float second2=in.nextFloat();
		    result=(first+second+first1+second2)/4;
		    positiveornegative(result);
		    break;
		 
	  default:
	    System.out.println("The number you have entered is invalid ");
	}
	
	}
	
	static void positiveornegative(float i)
	{
		if(i<0)
		{
			System.out.println("Oops optionX(1/2/3/4/5/) is returning the negative number");
		    
		}
		else
		{
			 
			System.out.println("The result is   "+ result);
		}
	}

}
