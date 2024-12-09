package basicprograms;

public class Final_var_program 
{
	static int a=10;        //global variable
	final static int b=20;  //final global variable

	public static void main(String[] args)
	{
		a=a+10;//we can modify global variable
		System.out.println(a);
		a=a+20;//we can modify global variable
		System.out.println(a);
		System.out.println(b);
		//b=b+10 we cannot modify final variable
	}

}
