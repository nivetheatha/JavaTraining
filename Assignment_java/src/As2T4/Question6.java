package As2T4;

public class Question6 {

	public static void main(String[] args) {
		int arr[]= {2,2,3,3,4,4,4,11,11,11,11};
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
				}
				
			}
		}
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]!=0)
			{
				temp[j]=arr[i];
				j++;
				
				
			}
		}
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
		
		
	}

	}


