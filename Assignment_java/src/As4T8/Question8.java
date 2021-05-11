package As4T8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question8 {

	public static void main(String[] args) throws IOException {
		List<Integer> Age = new ArrayList<Integer>();
		String line = "";   
		try   
		{   
		BufferedReader br = new BufferedReader(new FileReader(".\\Files\\Employee.csv"));  
		while ((line = br.readLine()) != null)   
		{  
		String[] employee = line.split(",");   
		Age.add(Integer.parseInt(employee[1]));
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
		int c= Age.size();
		Integer sum= Age.stream().mapToInt(Integer::intValue).sum();
        System.out.print("The Average Age will be   "+(float)sum/c);
		
	}  
		
}
