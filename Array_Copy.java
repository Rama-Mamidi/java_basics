package arrayprograms;

import java.util.Arrays;

public class Array_Copy 
{

	public static void main(String[] args) 
	{
		int num1[]=new int[3];
		int num2[]=new int[3];
		num1[0]=10;
		num1[1]=20;
		num1[2]=30;
		for(int i=0;i<num1.length;i++)
		{
		num2[i]=num1[i];
		}
		System.out.println("The old array is "+Arrays.toString(num1));
		System.out.print("The new array which is copied from old array is ");
		System.out.println(Arrays.toString(num2));
	}

}
