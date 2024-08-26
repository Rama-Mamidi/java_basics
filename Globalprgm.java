package basicprograms;

public class Globalprgm 
{
	static int a=10;//Global variable
	static int b=6;//Global variable
	int c=30;
	
	static void add()
	{
		int a=30;
		int b=20;
		System.out.println(a+b);//local variable
				
	}
	void addc()
	{
		System.out.println(c);
	}
	static void mul()
	{
		System.out.println(a*b);//global variable
	}
	static void sub()
	{
		System.out.println(a-b);//global variable
	}
	public static void main(String[] args)
	{
		add();
		mul();
		sub();
		System.out.println(a);//printing global variable
		System.out.println(b);//printing global variable
		Globalprgm c1=new Globalprgm();
		c1.addc();
	}
}