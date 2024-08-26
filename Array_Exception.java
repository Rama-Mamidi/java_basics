package arrayprograms;
import java.util.Arrays;

public class Array_Exception 
{
	public static void main(String[] args) 
	{
		int a[]=new int[4];
		try
		{
			a[0]=23;
			a[1]=25;
			a[2]=34;
			a[3]=56;
			a[4]=70;//exception will occur at this line
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Sorry, you cannot enter more elements than the array size");
		}
		System.out.print("The elements of the array are --> ");
		System.out.println(Arrays.toString(a));
	}
}
