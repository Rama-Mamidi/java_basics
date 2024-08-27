package mapinterfacePrograms;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface1 
{

	public static void main(String[] args) 
	{
		Map m1=new HashMap();
		m1.put("Rama",2);
		m1.put("Shashi",35);
		m1.put("Durga",4);
		m1.put("Nagaraju",5);
		m1.put("Rakesh",6);
		System.out.println(m1);
		m1.remove("shashi");
		Boolean b1=m1.remove("Rama",2);
		System.out.println(b1);
		System.out.println(m1);
		Boolean b2=m1.replace("Shashi",4,4);
		System.out.println(b2);
		System.out.println(m1);
		Boolean b3=m1.replace("Shashi",3,5);
		System.out.println(b3);
		System.out.println(m1);
		System.out.println(m1.putIfAbsent("Shashi", 45));
		System.out.println(m1);
		
		
	}

}
