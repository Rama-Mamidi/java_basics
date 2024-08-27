package stringprograms;

public class String_Matches
{

	static void starts_with()
	{
		String s1="Rama Krishna";
		String s2="Advitha Sai";
		boolean b1=s1.matches("R(.*)");
		if(b1==true)
		{
			System.out.println("The string s1 starts with letter R");
		}
		else
		{
			System.out.println("The string s1 doesn't starts with letter R");
		}
	}
	static void ends_with()
	{
		String s1="Rama Krishna";
		String s2="Advitha Sai";
		boolean b1=s1.matches("(.*)a");
		if(b1==true)
		{
			System.out.println("The string s1 ends with letter a");
		}
		else
		{
			System.out.println("The string s1 doesn't ends with letter a");
		}
	}
	static void has_11letters()
	{
		String s1="Rama Krishna";
		String s2="Advitha Sai";
		boolean b1=s2.matches("...........");
		if(b1==true)
		{
			System.out.println("The string s2 has 11 letters in it");
		}
		else
		{
			System.out.println("The string s2 doesn't has 11 letters in it");
		}
	}
	static void has_letter()
	{
		String s1="Rama Krishna";
		String s2="Advitha Sai";
		boolean b1=s1.matches("(.*)R(.*)");
		if(b1==true)
		{
			System.out.println("The string s1 has letter R in it");
		}
		else
		{
			System.out.println("The string s1 doesn't has letter R in it");
		}
	}
	
	public static void main(String[] args) 
	{
		starts_with();
		ends_with();
		has_11letters();
		has_letter();
		
	}

}
