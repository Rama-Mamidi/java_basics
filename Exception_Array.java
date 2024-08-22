package ab44;

import java.util.Arrays;
import java.util.Scanner;

public class Exception_Array 
{

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the rollnos");
		
		try
		{
			for(int i=0;i<4;i++)
			{
				rollno[i]=s1.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Array max limit reached");
		}
		
		System.out.println(Arrays.toString(rollno));

	}

}
