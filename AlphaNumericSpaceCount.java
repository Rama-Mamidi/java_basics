package stringprograms;

public class AlphaNumericSpaceCount 
{
	static int alpha_count=0;
	static int num_count=0;
	static int space_count=0;
	public static void main(String[] args) 
	{
		String input="kv 123 bangalore";
		char c1[]=input.toCharArray();
		for (int i=0;i<c1.length;i++)//for loop for counting alphabets
		{
			boolean output=Character.isAlphabetic(c1[i]);
			if(output==true)
			{
				alpha_count++;
			}
		}
		for (int i=0;i<c1.length;i++)//for loop for counting numerals
		{
			boolean output=Character.isDigit(c1[i]);
			if(output==true)
			{
				num_count++;
			}
		}
		for (int i=0;i<c1.length;i++)//for loop for counting spaces
		{
			boolean output=Character.isSpaceChar(c1[i]);
			if(output==true)
			{
				space_count++;
			}
		}
		System.out.println("The number of alphabets, numerals and spaces are");
		System.out.println(alpha_count);
		System.out.println(num_count);
		System.out.println(space_count+" respectively");
	}
}
