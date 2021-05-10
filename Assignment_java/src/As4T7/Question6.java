package As4T7;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		int d=0;//digits
		int Armstrong=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any Number");
		int v=in.nextInt();
		int input=v;
		int copy=v;
		while(copy>0)
		{
		 d=d+1;
		 copy=copy/10;
		}
while(v>0)
{   int m=1;
	int sd= v%10;  //seperating digits
	v=v/10;
	
	for(int i=0;i<d;i++)
		{
		 m=m*sd;	
		
		}
	Armstrong=Armstrong+m;
}
if(input==Armstrong)
{
	System.out.println("The number you entered is a Armstrong Number");
}
else
{
	System.out.println("The number you entered is not a Armstrong Number");
}
	}

}
