package ab44;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling
{
    static int age;
    static String name;
    void age_name()
    {
    	try
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the age");
			int age=s1.nextInt();
			this.age=age;
		}
		catch(InputMismatchException i1)
		{
			System.out.println("Please read the instructions carefully and enter the age");
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter the age");
			int age=s2.nextInt();
			this.age=age;
		}
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s3.next();
		System.out.println("Your details are");
		System.out.println("1. Name: "+name);
		System.out.println("2. Age : "+age+" Years");
		//s1.close();
    }
	public static void main(String[] args) 
	{
		Exception_Handling e1=new Exception_Handling();
		e1.age_name();
	}
}
