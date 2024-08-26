package basicprograms;

public class Constructor_overloading
{
	Constructor_overloading()
	{
		System.out.println("I am in constructor method1");
	}
	
	Constructor_overloading(int a)
	{
		System.out.println("I am in constructor method2");
	}
	
	Constructor_overloading(int a, float b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	void add()
	{
		System.out.println("I am in method4");
	}
	public static void main(String[] args)
	{
		new Constructor_overloading();
		new Constructor_overloading(2);
		Constructor_overloading a1=new Constructor_overloading(2,1.23f);
		//Constructor_overloading a2=new Constructor_overloading(3,1.30f);
		new Constructor_overloading().add();
		a1.add();
		
	}

}
