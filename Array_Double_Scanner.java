package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Double_Scanner 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the values of Array");
		double num[]=new double[3];
		for(int i=0;i<num.length;i++)
		{			
			num[i]=s1.nextDouble();
		}
		System.out.print("The values of array are ");
		System.out.println(Arrays.toString(num));
		s1.close();
	}
	
	
}
