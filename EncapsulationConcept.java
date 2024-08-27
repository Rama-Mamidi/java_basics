package assignmentprograms;
import java.util.Scanner;

class Flipkart
{
	private String password="xyz";
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
}
public class EncapsulationConcept 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the password to login");
		String password=s1.next();
		Flipkart f=new Flipkart();
		f.setPassword(password);
		System.out.println("The entered password is "+f.getPassword());
	}
}
