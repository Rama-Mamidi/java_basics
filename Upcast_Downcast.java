package ab44;
class Parent
{
	void add()
	{
		int a=10,b=20;
		System.out.println("1. Addition of 10 & 20 is "+(a+b));
	}
	void sub()
	{
		int a=10,b=20;
		System.out.println("2. Substraction of 10 & 20 is "+(b-a));
	}
	static void mul()
	{
		int a=10,b=20;
		System.out.println("3. Multiplication of 10 & 20 is "+(a*b));
	}
	static void div()
	{
		int a=10,b=20;
		System.out.println("4. Division of 20 with 10 is "+(b/a));
	}
}
public class Upcast_Downcast extends Parent
{
	void mod()
	{
		int a=12,b=5;
		System.out.println("5. Modulus of 12 with 5 is "+(a%b));
	}
	void sqrt()
	{
		int a=16;
		System.out.println("6. Square root of 16 is "+(Math.sqrt(a)));
	}
	public static void main(String[] args) 
	{
		Parent u1=(Parent) new Upcast_Downcast();//Upcasting
		System.out.println("...Parent methods output after Upcasting...");
		System.out.println(" ");
		u1.add();
		u1.sub();
		u1.mul();
		u1.div();
		System.out.println(" ");
		System.out.println("...DOWNCASTING after UPCASTING...");
		System.out.println(" ");
		Upcast_Downcast u2=(Upcast_Downcast) u1;//Downcasting
		System.out.println("...Parent methods output after Downcasting...");
		System.out.println(" ");
		u2.add();
		u2.sub();
		u2.mul();
		u2.div();
		System.out.println(" ");
		System.out.println("...Child methods output after Downcasting...");
		System.out.println(" ");
		u2.mod();
		u2.sqrt();
		u2.square();
		u2.cube();
	}
	static void square()
	{
		int a=10;
		System.out.println("7. Square of 10 is "+(a*a));
	}
	static void cube()
	{
		int a=10;
		System.out.println("8. Cube of 10 is "+(a*a*a));
	}	
}
