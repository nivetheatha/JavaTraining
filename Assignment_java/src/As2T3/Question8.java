package As2T3;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Leap Year Or Not");
		System.out.println("Enter the year ");
		int year=in.nextInt();
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println("Leap year");
        } else {
        	System.out.println("Not a leap year");
        }

	}

}
