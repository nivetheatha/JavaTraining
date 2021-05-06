package As3T6;
public class AddAmount {
static int amount=50;
static int trans=0;
AddAmount()
{	
trans++;
}
AddAmount(int a)
{
	amount=amount+a;
    trans++;
}
void final_amount()
{
	System.out.println("The Final amount in the Saving Box is  "+amount);
}
void transaction()
{
	System.out.println("The total transation will be   "+trans);
}
}
