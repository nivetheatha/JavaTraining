package As1T1;

public class Swap {
public static void main(String[] args) {
		
		int a=67,b=48,c;
		
		//swapping with third variable
		c=b;
		b=a;
		a=c;
		System.out.println("a value is  "+a);
		System.out.println("b value is  "+b);
		
		//swapping without third variable
		a=a+b;
		b=a-b;
		a=a-b;
	    System.out.println("a value is  "+a);
		System.out.println("b value is  "+b);
		
		
	}

}
