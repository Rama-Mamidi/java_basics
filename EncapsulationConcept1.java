package assignmentprograms;
import java.util.Scanner;

class CreditCard
{
	private int cvv;
	
	public int getCvv()
	{
		return cvv;
	}
	public void setCvv(int cvv)
	{
		this.cvv=cvv;
	}
}
public class EncapsulationConcept1 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the CVV of your credit card");
		int cvv=s1.nextInt();
		CreditCard c=new CreditCard();
		c.setCvv(cvv);
		System.out.println("The entered cvv of your credit card is "+c.getCvv());
	}
}
