package ab44;

import java.util.Scanner;

public class TypeCasting_Program 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter your age");
		byte age=s1.nextByte();
		short age1=(short)age;
		System.out.println("The entered age is "+age1+" years converted into short from byte");
		
	}

}
