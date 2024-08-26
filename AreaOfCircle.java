package basicprograms;

import java.util.Scanner;

public class AreaOfCircle 
{

	public static void main(String[] args) 
	{
		final double pi=3.14;
		System.out.println("Enter the radius");
		Scanner s1=new Scanner(System.in);
		int r=s1.nextInt();
		double area=pi*r*r;
		System.out.println("Area of circle is "+area);
		s1.close();
	}

}
