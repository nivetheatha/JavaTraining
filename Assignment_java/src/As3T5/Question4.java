package As3T5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any string");
		String input=in.next();
		System.out.println(isogram(input));
		
}
	static boolean isogram(String s)
	{
		char[] str;
		str=s.toCharArray();
		int l =str.length;
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(str[i]==str[j])
				{
					return false;
				}
			}
		}
		return true;
		
	}

}
