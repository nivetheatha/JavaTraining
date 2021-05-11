package As4T8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList("nivethetha","tanishka","ruby","sankar","ramesh"));
		List<String> output=names.stream().filter(s->s.endsWith("a")).collect(Collectors.toList());
        System.out.println(output);
	}

}
