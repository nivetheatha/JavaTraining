package As2T3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number in the range of 1-12 to identify number of days ");
		System.out.println("1.January");
		System.out.println("2.Febrauary");
		System.out.println("3.March");
		System.out.println("4.April");
		System.out.println("5.May");
		System.out.println("6.June");
		System.out.println("7.July");
		System.out.println("8.August");
		System.out.println("9.September");
		System.out.println("10.October");
		System.out.println("11.November");
		System.out.println("12.December");
		int j=in.nextInt();
		System.out.println("Enter the year");
		int y=in.nextInt();
		
			if(j==1)
			{
				System.out.println("January "+y+" has 31 days");
			}
			else if(j==2)
			{
				if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) {
					System.out.println("Febrauary "+y+" has 29 days");
                } else {
                	System.out.println("Febrauary "+y+" has 28 days");
                }
			}
			else if(j==3)
			{
				System.out.println("March "+y+" has 31 days");
			}
			else if(j==4)
			{
				System.out.println("April "+y+" has 30 days");
			}
			else if(j==5)
			{
				System.out.println("May "+y+" has 31 days");
			}
			else if(j==6)
			{
				System.out.println("June "+y+" has 30 days");
			}
			else if(j==7)
			{
				System.out.println("July "+y+" has 31 days");
			}
			else if(j==8)
			{
				System.out.println("August "+y+" has 31 days");
			}
			else if(j==9)
			{
				System.out.println("September "+y+" has 30 days");
			}
			else if(j==10)
			{
				System.out.println("October "+y+" has 31 days");
			}
			else if(j==11)
			{
				System.out.println("November "+y+" has 30 days");
			}
			else if(j==12)
			{
				System.out.println("April "+y+" has 31 days");
			}
			else 
			{
				System.out.println("Invalid Month");
			}
					
	}

}
