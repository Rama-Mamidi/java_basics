package basicprograms;

import java.util.Scanner;

public class AreaOfRectangle 
{

	static int l,b;
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		l=s1.nextInt();
		System.out.println("Enter breadth of rectangle");
		b=s1.nextInt();
		int area=l*b;
		System.out.println("Area of rectangle is "+area);
		s1.close();
	}

}
