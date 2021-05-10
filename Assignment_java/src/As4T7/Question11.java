package As4T7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Question11 {
	 static Map<String, Integer> map = new HashMap<>(); //key,values
	public static void main(String[] args) {
		 map.put("Nivethetha", 80);
	     map.put("Akash", 90);
	     map.put("Anushka", 80);
	     map.put("Amit", 75);
	     map.put("Tanishka", 40);
	     
	     //sorting based on values
	     System.out.println("Sorted based on Values");
	     for (String i : map.keySet()) {
	         System.out.println("Name: " + i + " Age: " + map.get(i));
	       }
	     System.out.println("");
	     
	     //sorting based on key
	     System.out.println("Sorted based on Key");
	     Sortbykey();
	     
	}
static void	Sortbykey()
{
	 
    TreeMap<String, Integer> sorted = new TreeMap<>();
    sorted.putAll(map);
    for (Map.Entry<String, Integer> entry : sorted.entrySet())
        System.out.println("Name = " + entry.getKey() +
                     ", Age = " + entry.getValue());  
}

}
