package basicprograms;

public class If_Else_Ticket 
{
	public static void main(String[] args)
	{
		char gender='F';
		int age=60;
				
		if(gender=='M')
		{
			if(age<=12)
			{
				System.out.println("Half Ticket");
			}
			else if(age>12 && age<=59)
			{
				System.out.println("Full Ticket");
			}
			else
			{
				System.out.println("Senior Citizen Ticket");
			}
		}
		else
		{
			System.out.println("Free Ticket");
		}
	}
}
