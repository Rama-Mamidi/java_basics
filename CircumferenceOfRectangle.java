package basicprograms;

import java.util.Scanner;

public class CircumferenceOfRectangle 
{

	public static void main(String[] args) 
	{
		int l;
		int b;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter length of the Rectangle");
		l=s1.nextInt();
		System.out.println("Enter breadth of the Rectangle");
		b=s1.nextInt();
		int circumference=2*(l+b);
		System.out.println("The circumference of Rectangle is "+circumference);
		s1.close();
	}

}
