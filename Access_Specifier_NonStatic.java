package Access_Specifier1;

public class Access_Specifier_NonStatic 
{
	void method1()
	{
		System.out.println("Package/default method-same class within same package");
	}
	protected void method2()
	{
		System.out.println("Protected method-same class within same package");
	}
	private void method3()
	{
		System.out.println("Private method-same class within same package");
	}
	public void method4()
	{
		System.out.println("Public method-same class within same package");
	}
		public static void main(String[] args) 
	{
		Access_Specifier_NonStatic ns=new Access_Specifier_NonStatic();
		ns.method1();
		ns.method2();
		ns.method3();
		ns.method4();
	}
	
}
