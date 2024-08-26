package arrayprograms;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array_Exception1 
{
	static int size;
	static int a[]=new int[size];
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of array");
		try
		{
		size=s1.nextInt();
		int a[]=new int[size];
		a[0]=34;
		a[1]=23;
		a[2]=87;
		a[3]=99;
		a[4]=120;
		}
		catch(InputMismatchException i)
		{
			System.out.println("Please enter numeric value");
			Scanner s2=new Scanner(System.in);
			size=s2.nextInt();
			int a[]=new int[size];
			a[0]=34;
			a[1]=23;
			a[2]=87;
			a[3]=99;
			System.out.println("The elements of array are");
			System.out.println(Arrays.toString(a));
		}
		catch(ArrayIndexOutOfBoundsException k)
		{
			System.out.println("Array max size exceeded");
			int a[]=new int[size];
			a[0]=34;
			a[1]=23;
			a[2]=87;
			a[3]=99;
			System.out.println("The elements of array are");
			System.out.println(Arrays.toString(a));
		}
	}
}
