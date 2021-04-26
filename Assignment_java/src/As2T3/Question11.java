package As2T3;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first floating number");
        float f1=in.nextFloat();
        System.out.println("Enter second floating number");
        float f2=in.nextFloat();
        float f1_round=(float) (Math.round(f1*100.0)/100.0);
        float f2_round=(float) (Math.round(f2*100.0)/100.0);
        System.out.println(f1_round+" "+f2_round);
       if(f1_round==f2_round)	
       {
    	   System.out.println("Both values are Equal upto two decimal");
       }
       else
       {
    	   System.out.println("values are not equal");		  
       }
	}
	

}
