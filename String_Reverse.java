package stringprograms;

public class String_Reverse 
{
	public static void main(String[] args) 
	{
		String input="Raghava";
		String output="";
		//double a=Math.random();
		//System.out.println(a);
						
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		System.out.println("The reverse of the given string is "+output);
	}

}
