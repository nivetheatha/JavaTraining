package As1T2;

public class Flowchart {
	public static void main(String[] args) {
	int a=10,b=20,c=30;
	float avg =(a+b+c)/3;
	System.out.println("avg  "+avg);
	if(avg>a)
	{
		if(avg>b)
		{
			if(avg>c)
			{
				System.out.println("Avg is higher than a,b,c");
			}
			else
			{
				System.out.println("Avg is higher than a,b");
			}
		}
	  else if(avg>c)
	  {
		  System.out.println("Avg is higher than a,c");
	  }
	  else
	  {
		  System.out.println("Avg is higher than a");
	  }
	}
	else if(avg>b)
	{
		if(avg>c)
		{
			System.out.println("Avg is higher than b and c");
		}
		else
		{
			System.out.println("Avg is higher than b");
		}
	}
	else if(avg>c)
	{
	System.out.println("Avg is higher than c");
	}	
}
}
