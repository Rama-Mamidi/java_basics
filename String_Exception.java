package stringprograms;

import java.util.Arrays;

public class String_Exception 
{

	public static void main(String[] args) 
	{
		String s1="Rama Krishna";
		String s2="Mamidi ";
		System.out.println(s1.length());
		try
		{
			for(int i=0;i<=12;i++)
			{
				System.out.println(s1.charAt(i));
			}
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			String s3=s2.concat(s1);
			System.out.println(s3);
		}
	}

}
