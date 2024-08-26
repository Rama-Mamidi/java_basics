package Access_Specifier1;

public class Access_Specifier_NonStatic1 
{
	     void method1()
		{
			System.out.println("Package/default method-different class within same package");
		}
		protected void method2()
		{
			System.out.println("Protected method-different class within same package");
		}
		private void method3()
		{
			System.out.println("Private method-different class within same package");
		}
		public void method4()
		{
			System.out.println("Public method-different class within same package");
		}

}
