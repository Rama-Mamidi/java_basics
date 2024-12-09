package basicprograms;

import java.util.Scanner;

public class AreaOfTriangle 
{

	static int b,h;
	
	public static void main(String[] args)
	{
		System.out.println("Enter breadth of the triangle");
		Scanner s1=new Scanner(System.in);
		b=s1.nextInt();
		System.out.println("Enter height of the triangle");
		h=s1.nextInt();
		int area=(b*h)/2;
		System.out.println("Area of triangle is "+area);
		s1.close();
	}

}
