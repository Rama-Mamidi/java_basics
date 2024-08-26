package Access_Specifier1;

public class AccessSpecifierPrgm2 //Same class same package
{
	 	
		 static void method1()
		{
			System.out.println("Package/default method-different class within same package");
		}
		protected static void method2()
		{
			System.out.println("Protected method-different class within same package");
		}
		private static void method3()
		{
			System.out.println("Private method-different class within same package");
		}
		public static void method4()
		{
			System.out.println("Public method-different class within same package");
		}
		
}
