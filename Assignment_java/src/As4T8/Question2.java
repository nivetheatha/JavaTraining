package As4T8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		List<String> Seperate_word = new ArrayList<String>();
		String input="Be Happy Stay Motivated";
		String words[] = input.split(" ");
	      for(String token : words) {
	         Seperate_word.add(token);
	      }
	      System.out.println("The Number of words in the string wiill be  "+ Seperate_word.stream().count());

	}

}
