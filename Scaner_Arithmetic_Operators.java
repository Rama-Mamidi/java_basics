package basicprograms;
import java.util.Scanner;

public class Scaner_Arithmetic_Operators 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		
		System.out.println("The addition of two numbers is"+" "+sum);
		System.out.println("The Substraction of two numbers is"+" "+sub);
		System.out.println("The Multiplication of two numbers is"+" "+ mul);
		System.out.println("The Division of two numbers is"+" "+div);
		System.out.println("The Modulus of two numbers is"+" "+mod);
		s1.close();
	}
}
