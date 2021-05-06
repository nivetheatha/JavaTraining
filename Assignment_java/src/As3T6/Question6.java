package As3T6;

public class Question6 {

	public static void main(String[] args) {
		
		
		System.out.println("Calling Constructor without parameter");
		AddAmount a1=new AddAmount();
		a1.final_amount();
		a1.transaction();
		System.out.println("Calling Constructor with parameter as 60");
		AddAmount a2=new AddAmount(60);
		a2.final_amount();
		a2.transaction();
		System.out.println("Calling Constructor with parameter as 20");
		AddAmount a3=new AddAmount(20);
		a3.final_amount();
		a3.transaction();
		
	}

}
