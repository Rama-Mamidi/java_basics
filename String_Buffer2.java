package stringprograms;

public class String_Buffer2 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer(24);
		StringBuffer s3=new StringBuffer("Rama Krishna");
		System.out.println(s1.capacity());
		System.out.println(s2.capacity());
		System.out.println(s3.capacity());
		s3.append(" Mamidi");
		System.out.println(s3);
		s3.delete(12,19);
		System.out.println(s3);
		s3.insert(0, "Mamidi ");
		System.out.println(s3);
		s3.replace(12, 19, "Murthy");
		System.out.println(s3);
		s3.reverse();
		System.out.println(s3);
		System.out.println(s3.reverse());
		System.out.println(s3.substring(12,18));
		System.out.println(s3.substring(7));
		System.out.println(s3.length());
		s2.ensureCapacity(50);
		System.out.println(s2.capacity());
	}
}
