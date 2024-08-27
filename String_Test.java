package stringprograms;


public class String_Test 
{

	public static void main(String[] args)
	{
		String str1="Java";
		String str2="Java";
		
		System.out.println(str1==str2);
		
		String s1="Welcome to Java!";
		String s2=s1.replace("Java", "GroTechMinds");
		System.out.println(s2);
		
		String s3="Gro TechMinds";
		System.out.println(s3.substring(4,8));
		
		String str = "Welcome to Java!";
		String result = str.replace("Java", "GroTechMinds");
		System.out.println(result);
		System.out.println(str);

	}

}
