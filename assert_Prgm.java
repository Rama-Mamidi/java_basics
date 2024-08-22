package ab44;

public class assert_Prgm 
{

	public static void main(String[] args)
	{
		int a=10;
		String s="Rama";
		assert a==10:"Incorrect value";
		System.out.println(a);
		assert s.equals("rama"):"Incorrect String";
		System.out.println(s);

	}

}
