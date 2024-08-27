package stringprograms;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String input="SOLAR";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		if(input.equals(output))
		{
		System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}
}
