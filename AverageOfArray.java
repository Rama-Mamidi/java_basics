package arrayprograms;

public class AverageOfArray 
{

	public static void main(String[] args) 
	{
		int marks[]=new int[4];
		marks[0]=56;
		marks[1]=78;
		marks[2]=88;
		marks[3]=92;
		double sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		double average=sum/4;
		System.out.println("The average of array is "+average);
	}

}
