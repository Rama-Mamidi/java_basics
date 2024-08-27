package assignmentprograms;

class Amazon
{
	void current_balance(double debited_amount)
	{
		double actual_amount=12000.50;
		double current_balance=actual_amount-debited_amount;
		System.out.println("The current balance after debit of Rs "+debited_amount+" is "+current_balance);
	}
}
public class Polymorphism_Runtime extends Amazon
{
	 void current_balance(double debited_amount)
	{
		double actual_amount=20000.50;
		double current_balance=actual_amount-debited_amount;
		System.out.println("The current balance after debit of Rs "+debited_amount+" is "+current_balance);
	}
	public static void main(String[] args) 
	{
		Amazon a=new Amazon();
		a.current_balance(2000.50);
		Polymorphism_Runtime p=new Polymorphism_Runtime();
		p.current_balance(2000.50);
	}
}
