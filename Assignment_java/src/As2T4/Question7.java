package As2T4;

public class Question7 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,9,6,5,4};
		int c;
		
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
		if(arr.length>1)
		{
	
		int result=arr[0]-arr[arr.length-1];
		System.out.println("The Difference betweebn largest and smallest values in the array is "+result);
		}
		else
		{
			System.out.println("Array length should be atleast 1");
		}
	}

	}


