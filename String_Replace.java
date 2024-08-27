package stringprograms;

public class String_Replace 
{

	public static void main(String[] args) 
	{
		String a1="Rama Krishna Mamidi";
		String a2="Advitha Sai123";
		String s1=a1.replace("a","T");
		String s2=a2.replace(" ","");
		System.out.println(s1);
		System.out.println(s2);
		String s3=a1.replaceAll("[A-Z]","");
		String s4=s3.replaceAll("[a-z]","");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s4.length());
		char s5[]=new char[5];
		s5=s4.toCharArray();
		System.out.println(Character.isSpaceChar(s5[1]));
		String s6=a2.replaceAll("[0-9]","A");
		System.out.println(s6);
	}

}
