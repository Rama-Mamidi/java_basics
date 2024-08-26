package arrayprograms;
import java.util.Arrays;

public class Arrays_Equal 
{
	public static void main(String[] args) 
	{
		int marks[]=new int[4];
		int marks1[]=new int[4];
		marks[0]=98;
		marks[1]=78;
		marks[2]=56;
		marks[3]=88;		
		marks1[0]=98;
		marks1[1]=78;
		marks1[2]=56;
		marks1[3]=88;
		
		boolean b=Arrays.equals(marks, marks1);
		if(b==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
			
	}
}
