package As4T7;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=in.next();
		combine(s, new StringBuffer(), 0);
	}
	static void combine(String instr, StringBuffer outstr,int index)
	{
		
		
	    for (int i = index; i < instr.length(); i++)
	   {
	       outstr.append(instr.charAt(i));
	       System.out.println(outstr);
	       combine(instr, outstr,i+1);
	       outstr.deleteCharAt(outstr.length() - 1);
	    }
	} 

	
}
