package As2T3;

import java.util.Scanner;

public class Question3 {

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
		
			switch(j){
			case 1:
				System.out.println("Month  :        January");
				System.out.println("Number of days: 31");
				break;
			case 2:
				System.out.println("Month  :        Febrauary");
				if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) {
					System.out.println("Number of days: 29");
                } else {
                	System.out.println("Number of days: 28");
                }
				break;
			case 3:
				System.out.println("Month  :        March");
				System.out.println("Number of days: 31");
				break;
			case 4:
				System.out.println("Month  :        April");
				System.out.println("Number of days: 30");
				break;
			case 5:
				System.out.println("Month  :        may");
				System.out.println("Number of days: 31");
				break;
			case 6:
				System.out.println("Month  :        June");
				System.out.println("Number of days: 30");
				break;
			case 7:
				System.out.println("Month  :        July");
				System.out.println("Number of days: 31");
				break;
			case 8:
				System.out.println("Month  :        August");
				System.out.println("Number of days: 31");
				break;
			case 9:
				System.out.println("Month  :        September");
				System.out.println("Number of days: 30");
				break;
			case 10:
				System.out.println("Month  :        october");
				System.out.println("Number of days: 31");
				break;
			case 11:
				System.out.println("Month  :        November");
				System.out.println("Number of days: 30");
				break;
			case 12:
				System.out.println("Month  :        December");
				System.out.println("Number of days: 31");
				break;
				
			default:
				System.out.println("Invalid Month number");
				break;
			
		}

	}

}
