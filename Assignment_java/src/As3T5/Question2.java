package As3T5;

public class Question2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,9,6,5,4}; //decending order
		int c,sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<=arr[j])
				{
					c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
				
			}
		}
		for(int i=1;i<arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of all values except highest and lowest number is   "+sum);
		
		
	}

}
