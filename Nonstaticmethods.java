package basicprograms;

public class Nonstaticmethods 
{
	void division()
	{
		int a=20;
		int b=10;
		int div=a+b;
		System.out.println(div);
	}

	void modulus()
	{
		int a=20;
		int b=3;
		int mod=a%b;
		System.out.println(mod);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Calling non static methods in Main");
		Nonstaticmethods a1=new Nonstaticmethods();
		a1.division();
		a1.modulus();
	}

}
