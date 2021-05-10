package As4T7;

import java.util.Scanner;

public class Question12 {
 static int arr[]= {1,2,3,9,6,5,4};
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Integer whose sum we need to find in an array");
	      int v=in.nextInt();
	      int n=arr.length;
	      checksubarray(arr,n,v);

	}
	 static int checksubarray(int arr[],int n,int sum) {
		
		 int curr_sum = arr[0], start = 0, i;
		 
	       
	        for (i = 1; i <= n; i++) {
	            while (curr_sum > sum && start < i - 1) {
	                curr_sum = curr_sum - arr[start];
	                start++;
	            }
	 
	          
	            if (curr_sum == sum) {
	                int p = i - 1;
	                System.out.println( "Sum found between indexes " + start  + " and " + p);
	                return 1;
	            }
	 
	           
	            if (i < n)
	                curr_sum = curr_sum + arr[i];
	        }
	 
	        System.out.println("No subarray found");
	        return 0;
	       
		
	}
	
	

}
