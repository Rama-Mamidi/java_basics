package access_specifier2;

import Access_Specifier1.AccessSpecifierPrgm6;


public class AccessSpecifierPrgm7 
{

	public static void main(String[] args)
	{
		AccessSpecifierPrgm6 a1=new AccessSpecifierPrgm6();
		a1.method4();//After typing "a1." we can see only one method available whose access specifier is public
	}

}
