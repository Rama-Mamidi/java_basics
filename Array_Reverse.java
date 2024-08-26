package arrayprograms;

import java.util.Arrays;

public class Array_Reverse 
{
	public static void main(String[] args) 
	{
		int num1[]=new int[3];
		int num2[]=new int[3];
		num1[0]=10;
		num1[1]=20;
		num1[2]=30;
		for(int i=0,k=num1.length-1;i<num1.length;i++,k--)
		{
				num2[k]=num1[i];
		}
		System.out.println("The old array is "+Arrays.toString(num1));
		System.out.println("The reverse of old array is "+Arrays.toString(num2));
		
	}

}
