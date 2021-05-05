package As3T5;

public class Question5 {

	public static void main(String[] args) {
		String s="Be Happy Stay Motivated";
		String words[] = s.split(" ");
	      for(String token : words) {
	         Reverse(token);
	      }
		
	}

	static void Reverse(String str)
	{
		char[] c;
		c=str.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
		 System.out.print(c[i]);	
		}
		System.out.print("   ");
		
	}
}
