package As4T7;

public class Question9 {

	public static void main(String[] args) {
		int[]  Array = new int[] {3,1,5,2,8};
		int max=Array[0];
		for(int i=0;i<Array.length;i++)
		{
			if(Array[i]>max)
			{
				max=Array[i];
			}
		}
		System.out.println("The maximum value in the array will be  "+max);
	}

}
