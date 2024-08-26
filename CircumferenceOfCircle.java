package basicprograms;

import java.util.Scanner;

public class CircumferenceOfCircle 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int r=s1.nextInt();
		
		double circumference=2*Math.PI*r;
		System.out.println("Circumference of circle is "+circumference);
		s1.close();

	}

}
