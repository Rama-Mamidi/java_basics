package Access_Specifier1;

public class AccessSpecifierPrgm3 
{

	public static void main(String[] args) 
	{
		AccessSpecifierPrgm2 s1=new AccessSpecifierPrgm2();
		s1.method1();
		s1.method2();
		//s1.method3();//Method3 which is of access specifier private is not shown after typing "s1."
		s1.method4();

	}

}
