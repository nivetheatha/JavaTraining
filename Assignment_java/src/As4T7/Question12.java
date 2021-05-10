package As4T7;

import java.util.Scanner;

public class Question12 {
 
	public static void main(String[] args) {
		 int arr[]= {1,2,3,9,6,5,4};
		 int flag=0;
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter the Integer whose sum we need to find in an array");
		  int v=in.nextInt();
		     for(int i=0;i<arr.length;i++)
		     {
		    	 int sum=arr[i];
		    	 for(int j=i+1;j<arr.length;j++)
		    	 {
		    		 sum=sum+arr[j];
		    		 if(sum==v)
		    		 {System.out.println("The Subarray index will be starts from "+i+" to " +j);
		    		  flag=1;
		    		 }
		    		
		    	 }
		    	 
		     }
		     if(flag==0)
		     {
		    	System.out.println("No sub-Array found") ;
		     }
		
	}
	
	

}
