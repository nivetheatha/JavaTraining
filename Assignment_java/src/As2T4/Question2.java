package As2T4;

public class Question2 {

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
		System.out.println("The second largest number is  "+arr[1]);
	}

}
