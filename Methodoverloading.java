package basicprograms;

public class Methodoverloading 
{
		static void add()
	{
		System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println(a);
	}
	static void add(boolean a)
	{
		System.out.println(a);
	}

	static void add(int a,char b,double c,String s)
	{
		System.out.println(2);
	}
	
	public static void main(String[] args)
	{
		add();
		add(200);
		add(true);
		add(10,'R',2.35,"Rama");
	}
}
