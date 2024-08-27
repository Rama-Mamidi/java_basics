package mapinterfacePrograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface2 
{
	public static void main(String[] args) 
	{
		Map<String,Double> m1=new HashMap<String,Double>();
		m1.put("Rice",50.9);
		m1.put("Sugar",5.1);
		m1.put("Oil",5.7);
		m1.put("Jaggery",2.2);
		m1.put("Salt",1.9);
		System.out.println(m1);
		Boolean b1=m1.containsKey("Rice");
		Boolean b2=m1.containsValue(50.9);
		System.out.println(b1);
		System.out.println(b2);
		/*m1.clear();
		Boolean b3=m1.isEmpty();
		System.out.println(m1);
		System.out.println(b3);*/
		Map<String,Double> m2=new HashMap<String,Double>();
		
		m2.put("ToothPaste",2.9);
		System.out.println(m2);
		Boolean b4=m1.equals(m2);
		System.out.println(b4);
		if(m1.size()==m2.size())
		{
			System.out.println("Both m1 & m2 are of same size");
		}
		else
		{
			System.out.println("Both m1 & m2 are of different size");
		}
	}
}
