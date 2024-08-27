package stringprograms;

import java.util.Arrays;

public class String_Contains 
{
	public static void main(String[] args)
	{
		String s1="Manish Kumar Tiwari";
		String s2="Rama";
		String s3="";
		//contains
		System.out.println(s1.contains("Kumar"));
		System.out.println(s1.contains("kumar"));
		//split
		String name[]=s1.split(" ",3);
		String name1[]=s1.split("r",3);
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name1));
		//repeat
		System.out.println(s2.repeat(3));
		//endswith
		System.out.println(s1.endsWith("a"));
		System.out.println(s2.endsWith("a"));
		//isEmpty
		System.out.println(s1.isEmpty());
		System.out.println(s3.isEmpty());
	}

}
