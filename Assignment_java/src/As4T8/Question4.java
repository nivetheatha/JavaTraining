package As4T8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(20,13,11,45,67,3));
		int c=list.size();
		Integer sum= list.stream().mapToInt(Integer::intValue).sum();
        System.out.print("The Average of the integerlist will be   "+(float)sum/c);
	}

}
