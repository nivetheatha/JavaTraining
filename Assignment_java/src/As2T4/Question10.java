package As2T4;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
	      int arr[]= {1,2,-3,9,-6,5,-4};
	      int value1=arr[0];
	      int value2=arr[1];
	      int min_sum=value1+value2;
	      
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(Math.abs(arr[i]+arr[j])<Math.abs(min_sum))
					{ 
						
						value1=arr[i];
						value2=arr[j];
						min_sum=value1+value2;
					}
					
				}
				
			}
			System.out.println("The Two values that makes a sum nearer to zero is  "+value1+" "+value2);
			System.out.println("The sum will be  "+min_sum);
	}

}
