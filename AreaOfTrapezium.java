package basicprograms;

import java.util.Scanner;

public class AreaOfTrapezium 
{

	public static void main(String[] args)
	{
		int a,b,h;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter side a of Trapezium");
		a=s1.nextInt();
		System.out.println("Enter side b of Trapezium");
		b=s1.nextInt();
		System.out.println("Enter height of Trapezium");
		h=s1.nextInt();
		double area=0.5*(a+b)*h;
		System.out.println("Area of Trapezium is "+area);
		s1.close();
	}

}
