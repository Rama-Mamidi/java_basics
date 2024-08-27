package stringprograms;

public class String_Buffer1 {

	public static void main(String[] args) 
	{
		String s1=new String("Manish");
		s1.concat(" Tiwari");
		System.out.println(s1);
		System.out.println(s1.concat(" Tiwari"));
		
		StringBuffer s2=new StringBuffer("Ra");
		/*s2.append(" Krishna ");
		System.out.println(s2);
		s2.insert(13, "Mamidi");
		System.out.println(s2);
		s2.replace(5, 11, "Kumar");
		System.out.println(s2);
		s2.delete(5, 12);
		System.out.println(s2);
		s2.reverse();
		System.out.println(s2);*/
		System.out.println(s2.capacity());
		StringBuffer s3=new StringBuffer();
		s3.append("Krishna ");
		System.out.println(s3.capacity());
		System.out.println(s3.length());
		
		

	}

}
