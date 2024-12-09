package basicprograms;
import java.util.Scanner;

public class Switch_Case 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Select any one of the online shopping apps");
		System.out.print("Press 1 for Amazon ");
		System.out.print("Press 2 for Flipkart ");
		System.out.println("Press 3 for Zudio ");
		int caseinput=s1.nextInt();
		switch(caseinput)
		{
			case 1:
				System.out.println("Welcome to Amazon");
				break;
			case 2:
				System.out.println("Welcome to Flipkart");
				break;
			case 3:
				System.out.println("Welcome to Zudio");
				break;
			default:
				System.out.println("The input provided is incorrect");
		}
		s1.close();
}
	

}
