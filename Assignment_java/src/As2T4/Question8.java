package As2T4;

public class Question8 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,3,6,7};
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
				
			}
		}
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]!=-1)
			{
				temp[j]=arr[i];
				j++;
				
				
			}
		}
		
		for(int i=0;i<j;i++)
		{
			System.out.println(temp[i]);
		}
		System.out.println("The New length of the array is  "+j);
	}

}
