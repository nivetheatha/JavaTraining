package As4T8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 {

	public static void main(String[] args) {
		String output_file=".\\Files\\squareoutput.txt";
		List<Integer> list = new ArrayList<>(Arrays.asList(20,13,11,45,67,3));
		List <Integer>square=list.stream().map(i->i*i).collect(Collectors.toList());
		try
		{
		FileWriter writer = new FileWriter(output_file);
		for(int i=0;i<square.size();i++)
		{
	      writer.write(square.get(i).toString()+ "\t"+ "");
	      
		}
		
		writer.close();
		}
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
		System.out.println("Written the output to the file squareoutput.txt");
	}

}
