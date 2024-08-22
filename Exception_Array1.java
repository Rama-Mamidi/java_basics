package ab44;

import java.util.Arrays;
import java.util.Scanner;

public class Exception_Array1
{

	public static void main(String[] args) 
	{
		int size;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=s1.nextInt();
		int rollno[]=new int[size];
		Scanner s2=new Scanner(System.in);
		System.out.println("Please enter the rollnos");
		
		try
		{
			for(int i=0;i<=rollno.length;i++)
			{
				rollno[i]=s2.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Array maximum limit reached");
		}
		
		System.out.println(Arrays.toString(rollno));
	}
}
