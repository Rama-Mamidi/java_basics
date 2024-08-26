package arrayprograms;
import java.util.Scanner;

public class Array_Checknum 
{
	public static void main(String[] args) 
	{
		int num[]=new int[4];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		int count=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the number to search");
		int val=s1.nextInt();
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==val)
			{
				System.out.println("The entered number is found in the array");
			}
			else
			{
				count++;
			}
		}
		if(count==4)
		{
			System.out.println("The entered number is not found in the array");
		}
		s1.close();
	}
}
