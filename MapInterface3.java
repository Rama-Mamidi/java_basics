package mapinterfacePrograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface3 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Mohan",93);
		m1.put("Sham",85);
		m1.put("Vinod",74);
		m1.put("Hari",90);
		System.out.println(m1);
		m1.remove("Vinod");
		System.out.println(m1);
		m1.remove("Hari",90);
		System.out.println(m1);
		m1.put("Hari",90);
		m1.replace("Hari",93);
		System.out.println(m1);
		m1.replace("Hari",93,94);
		System.out.println(m1);
	}

}
