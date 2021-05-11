package As4T8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any String");
		String input=in.next();
		List<Character> Seperate = new ArrayList<Character>();
		for(int i=0;i<input.length();i++)
		{
		Seperate.add(i, input.charAt(i));	
		}
		List<Character> unique=Seperate.stream().filter(i->Collections.frequency(Seperate,i)==1).collect(Collectors.toList());
		System.out.println("The first non-repeated character in the String is "+unique.get(0));
		


	}

}
