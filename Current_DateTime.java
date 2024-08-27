package assignmentprograms;

import java.util.Date;

public class Current_DateTime {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		String time=d2.toString();
		System.out.println(time);
		System.out.println("Hours at this instant in current time is "+time.substring(11,13)+" Hours");
		System.out.println("Minutes at this instant in current time is "+time.substring(14,16)+" Minutes");
		System.out.println("Seconds at this instant in current time is "+time.substring(17,19)+" Seconds");
		System.out.println("Current year is "+(time.substring(time.length()-4)));

	}

}
