package As1T2;

import java.util.Scanner;

public class Charactercheck {
	public static void main(String[] args) {
		   char[] arr = {'r', 'a', 'n', 'd', 'o','m'};  
		   int r=0;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter any character");
			char i=in.next().charAt(0);
			char l=Character.toLowerCase(i);
			for(int j=0;j<6;j++)
			{
				if(l==arr[j])
				{
					r=1;
				}
				
			}
			if(r==1)
			{
				System.out.println("Found");
				
			}
			else
			{
				System.out.println("Not Found");
			}
			
	}
}
