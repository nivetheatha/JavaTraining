package As3T6;

public class Question5 {

	public static void main(String[] args) {
		System.out.println("Calling the function with no parameters");
		Rectangle r1=new Rectangle();
		r1.area();
		System.out.println("Calling the function with two parameters");
		Rectangle r2=new Rectangle(2,3);
		r2.area();
		System.out.println("Calling the function with one parameters");
		Rectangle r3=new Rectangle(2);
		r3.area();

	}

}
