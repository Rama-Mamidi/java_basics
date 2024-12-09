package basicprograms;

import java.util.Scanner;

public class CircumferenceOfTriangle
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the three sides of triangle");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		int circumference=a+b+c;
		System.out.println("Circumference of Triangle is "+circumference);
		s1.close();
	}

}
