package As3T6;


import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		Employee e1=new Employee("Robert",1994,"64C- Walls Streat");
		Employee e2=new Employee("Sam   ",2000,"68D- Walls Streat");
		Employee e3=new Employee("John  ",1999,"26B- Walls Streat");
	        ArrayList<Employee> al=new ArrayList<Employee>();
	        al.add(e1);
	        al.add(e2);  
	        al.add(e3); 
	        System.out.println("Name               Year of Joining                Address");
	        System.out.println("----------------------------------------------------------");
	    	for(int i=0;i<al.size();i++)
	    	{
	    		System.out.println(al.get(i).name+"                   "+al.get(i).year+"             "+al.get(i).address);
	    	}
	     

	}

}
