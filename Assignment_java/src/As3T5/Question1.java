package As3T5;

public class Question1 {

	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		int small=cars[0].length();
		String ans=cars[0];
		for(int i=0;i<cars.length;i++)
		{
			if((cars[i].length())<small)
			{
			ans=cars[i];
			small=cars[i].length();
			}
			
		}
		System.out.println("The Smallest string is "+ans);

	}

}
