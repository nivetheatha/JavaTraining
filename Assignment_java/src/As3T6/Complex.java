package As3T6;

public class Complex {
	void Addition(int r1,int i1,int r2,int i2)
	{
		int r =r1+r2;
		int i=i1+i2;
		if(i>0)
		System.out.println("The Result for addition of two complex numbers is"+r+"+"+i+"i");
		else
        System.out.println("The Result for addition of two complex numbers is"+r+" "+i+"i");
	}
	void Subtraction(int r1,int i1,int r2,int i2)
	{
		int r =r1-r2;
		int i=i1-i2;
		if(i>0)
		System.out.println("The Result for addition of two complex numbers is"+r+"+"+i+"i");
		else
        System.out.println("The Result for addition of two complex numbers is"+r+" "+i+"i");
	}
	void Multiplication(int r1,int i1,int r2,int i2)
	{
		int r =r1*r2;
		int i=i1*i2;
		if(i>0)
		System.out.println("The Result for addition of two complex numbers is"+r+"+"+i+"i");
		else
        System.out.println("The Result for addition of two complex numbers is"+r+" "+i+"i");
	}
}
