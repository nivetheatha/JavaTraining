package As3T6;

public class Rectangle {
int length;
int breath;
Rectangle()
{
	this.length=0;
	this.breath=0;
}
Rectangle(int l,int b)
{
	this.length=l;
	this.breath=b;
}
Rectangle(int v)
{
	this.length=v;
	this.breath=v;
}
void area() {
System.out.println("The Area is  "+(length*breath));
}

}
