package Access_Specifier1;

public class AccessSpecifierPrgm1 //Same class same package
{
	 static void method1()
	{
		System.out.println("Package/default method-same class within same package");
	}
	protected static void method2()
	{
		System.out.println("Protected method-same class within same package");
	}
	private static void method3()
	{
		System.out.println("Private method-same class within same package");
	}
	public static void method4()
	{
		System.out.println("Public method-same class within same package");
	}
		public static void main(String[] args) 
	{
		method1();
		method2();
		method3();
		method4();
	}
}
