package As3T5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		 // int even=1,odd=0;
		 System.out.print("Enter no. of elements you want in array:");
	        int  n = s.nextInt();
	        int arr[] = new int[n];
	        int temp[] = new int[n];
	        for(int i = 0; i < n; i++)
	        {
	        	System.out.println("Enter  the "+(i+1)+" elements:");
	            arr[i] = s.nextInt();
	            if(arr[i]%2==0)
	            {
	            	temp[i]=1;  //even means store 1
	            }
	            else
	            {
	            	temp[i]=0;  //odd means store 0
	            }
	            
	        }
	        
	        for(int i = 0; i < n; i++)
	        {
	        	for(int j=i+1;j<n;j++)
	        	{
	        		if(j+1<n)
	        		if((temp[i]!=temp[j])&&(temp[i]!=temp[j+1]))
	        		{
	        		System.out.println("The Different Element in the array is  "+arr[i]);
	        		System.exit(0);
	        		}
	        		
	        	}
	        }
	      if(temp[n-1]!=temp[n-2])
	      {
	    	  System.out.println("The Different Element in the array is  "+arr[n-1]);
      		
	      }
	        
	       	        
	        
	}

}
