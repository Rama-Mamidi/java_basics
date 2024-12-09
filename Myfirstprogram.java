package basicprograms;

public class Myfirstprogram 
{
	static void add()
	{ 
		int a=30;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	static void multiply()
	{
		int a=30;
		int b=2;
		int mul=a*b;
		System.out.println(mul);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Calling static methods from main");
		add();
		multiply();
	}
	
}
