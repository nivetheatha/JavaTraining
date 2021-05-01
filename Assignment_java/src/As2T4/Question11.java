package As2T4;

public class Question11 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,9,6,5,4};
		int desc[]=new int[arr.length];
		int asc[]=new int[arr.length];
		int c;
		for(int i=0;i<arr.length;i++)  //Decending order
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
		
int k=0;                                //copying descending order in different array  (desc)        
		
		for(int i=0;i<arr.length;i++)
		{
			
			
				desc[k]=arr[i];
				k++;
         }
		
		
		for(int i=0;i<arr.length;i++)         //arranging in ascending order
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>=arr[j])
				{
					c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
				
			}
		}
		
int l=0;                                //copying ascending order in different array  (asc)        
		
		for(int i=0;i<arr.length;i++)
		{
			
			
				asc[l]=arr[i];
				l++;
         }
		
	
	int a=0,d=0,i=0;
	
	while(i<arr.length)
	{
		arr[i]=desc[d];
		d++;i++;
		if(i<arr.length)
		{
			arr[i]=asc[a];
			a++;i++;
		}
	}
	
	System.out.println("The New array is");
		
		for(int g=0;g<arr.length;g++)
		{
			
			System.out.println(arr[g]);
			
		}
			
		
		
	
	
	}

}
