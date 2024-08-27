package stringprograms;

import java.util.Arrays;

public class String_Anagram 
{

	public static void main(String[] args) 
	{
		String s1="face";
		String s2="cafe";
		if(s1.length()==s2.length())
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1,c2))
			{
				System.out.println("The given strings are Anagrams");
			}
			else
			{
				System.out.println("The given strings are not Anagrams");
			}
		}
		else
		{
			System.out.println("The given two strings are not anagrams");
		}

	}

}
