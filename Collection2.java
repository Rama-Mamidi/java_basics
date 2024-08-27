package collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection2 
{
	public static void main(String[] args) 
	{
		Collection c3=new ArrayList();
		c3.add("Age");
		c3.add("Colour");
		c3.add(76);
		c3.add(false);
		c3.add(6.98);
		System.out.println(c3);
			
		Iterator i1=c3.iterator();
		System.out.println(i1);
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println(c3.size());
		boolean b1=c3.contains(c3);
		boolean b2=c3.containsAll(c3);
		System.out.println(b1);
		System.out.println(b2);
	}

}
