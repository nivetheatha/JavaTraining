package As2T4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		  Scanner in=new Scanner(System.in);
	      System.out.println("Ennter the Integer whose sum we need to find in an array");
	      int v=in.nextInt();
	      int arr[]= {1,2,3,9,6,5,4};
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if((arr[i]+arr[j])==v)
					{
						System.out.println("The values of two integer in the array   "+arr[i]+"  "+arr[j]+"  that make the sum "+v);
					}
					
				}
			}

	}

}
