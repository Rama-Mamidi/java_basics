package ab44;

public class SIB_IIB_Constructor1 
{
	static
	{
		System.out.println("SIB block");
	}
	{
		System.out.println("IIB block1");
	}
	{
		System.out.println("IIB block2");
	}
	{
		System.out.println("IIB block3");
	}
	SIB_IIB_Constructor1()
	{
		System.out.println("Constructor method");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new SIB_IIB_Constructor1();
		new SIB_IIB_Constructor1();

	}

}
