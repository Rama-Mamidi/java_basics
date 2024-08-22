package ab44;

public class Sib_Prgm 
{

	static
	{
		System.out.println("SIB block");
	}
	{
		System.out.println("IIB block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new Sib_Prgm();
	}

}
