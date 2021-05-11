package As4T8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question3 {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>(Arrays.asList(20,13,11,45,67,3));
	Optional <Integer>max=list.stream().max((val1,val2)->{return val1.compareTo(val2);});
    System.out.println("The Maximun value in the give list will be "+max.get());
}
}
