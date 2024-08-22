package ab44;

public class SIB_IIB_Constructor2 
{
	static
	{
		System.out.println("SIB block");
	}
	{
		System.out.println("IIB block1");
	}
	SIB_IIB_Constructor2()
	{
		System.out.println("Constructor method");
	}
	{
		System.out.println("IIB block2");
	}
	{
		System.out.println("IIB block3");
	}
	SIB_IIB_Constructor2(int a)
	{
		System.out.println("Constructor with single parameter");
	}
	SIB_IIB_Constructor2(int a,char c)
	{
		System.out.println("Constructor with two parameters");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new SIB_IIB_Constructor2();
		new SIB_IIB_Constructor2(1);
		new SIB_IIB_Constructor2(1,'a');

	}
}
