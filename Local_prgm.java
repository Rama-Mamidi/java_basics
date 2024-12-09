package basicprograms;

public class Local_prgm 
{
	
	static void add(int a)
	{
		System.out.println(a);//local variable
	}
	
	static void add(int a,char b)
	{
		System.out.println(a);//local variable
	}
	static void add(int a,boolean b)
	{
		System.out.println(a);//local variable
	}
	
	public static void main(String[] args)
	{
		add(20);
		add(30,'R');
		add(40,false);

	}
}
