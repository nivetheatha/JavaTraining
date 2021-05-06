package As3T6;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
	Student s1=new Student("Nivethetha");
	Student s2=new Student();
	Student s3=new Student("Tanishka");
	 ArrayList<Student> al=new ArrayList<Student>();
     al.add(s1);
     al.add(s2);
     al.add(s3);
     System.out.println("Name");
     System.out.println("------");
     for(int i=0;i<al.size();i++)
 	{
 		System.out.println(al.get(i).name);
 	}
   
     
	}

}
