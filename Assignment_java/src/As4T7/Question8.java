package As4T7;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the toltal number of objects to find permutation");
		int n=in.nextInt();
		System.out.println("Enter the number of object to be selected");
		int r=in.nextInt();
		if(r>n)
		{
			System.out.println("The objects to be selected should be within the total number of objects");
			System.exit(0);
		}
		System.out.println("The permutation value will be  "+permutation(n,r));
       
	}
	
 static int permutation(int n,int r)
	{
	return  (fact(n) / fact(n-r)) ;	
	}

	static int fact(int num) {
		int factorial=1;

		for(int i=1;i<=num;i++){    
		      factorial=factorial*i;    
		  }    
		return factorial;
	    }
}
