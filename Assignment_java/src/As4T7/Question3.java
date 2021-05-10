package As4T7;

public class Question3 {

	public static void main(String[] args) {
		int[]  Array1 = new int[] {4,5,6,7,8};
		int[]  Array2 = new int[] {3,1,5,2,8};
		System.out.println("The Intersection of two arrays will be");
       for(int i=0;i<Array1.length;i++)
       {
    	   for(int j=0;j<Array2.length;j++)
    	   {
    		   if(Array1[i]==Array2[j])
    		   {
    			   System.out.println(Array1[i]);
    		   }
    	   }
       }

	}

}
