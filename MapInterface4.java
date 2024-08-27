package mapinterfacePrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface4 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Mohan",93);
		m1.put("Sham",85);
		m1.put("Vinod",74);
		m1.put("Hari",90);
		System.out.println(m1);
		Map<String,Integer> m2=new HashMap<String,Integer>();
		m2.put("Swathi",85);
		m2.put("Pradeep",86);
		m2.put("Priya",87);
		m2.put("Anusha",88);
		System.out.println(m2.putIfAbsent("Swathi", 34));
		System.out.println(m2);
		Set<String> s1=m2.keySet();
		System.out.println(s1);
		System.out.println("Iteration using keySet method");
		for(String s2:m2.keySet())//Iteration method1
		{
			System.out.println(s2);
		}
		System.out.println("Iteration using values method");
		for(Integer i2:m2.values())//Iteration method2
		{
			System.out.println(i2);
		}
		System.out.println("Iteration using entrySet method");
		for(Entry<String,Integer> e1:m2.entrySet())
		{
			System.out.println(e1);
		}
		Collection<Integer> i1=m2.values();
		System.out.println(i1);
	}
}
