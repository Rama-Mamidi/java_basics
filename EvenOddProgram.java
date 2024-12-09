package basicprograms;

import java.util.Scanner;

public class EvenOddProgram 
{

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the number");
		Scanner s1=new Scanner(System.in);
		num=s1.nextInt();
		if(num%2==0)
		{
			System.out.println("The entered number is even");
		}
		else
		{
			System.out.println("The entered number is odd");
		}
		s1.close();
	}

}
