package As4T8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple","banana","pineapple","grapes","mango"));
		list.stream().map(s->s.toUpperCase()).forEach(i->System.out.println(i));

	}

}
