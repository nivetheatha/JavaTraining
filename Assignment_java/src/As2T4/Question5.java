package As2T4;

public class Question5 {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,3,1,0,3,6,7};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				temp[j++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(temp[i]);
		}

	}

}
