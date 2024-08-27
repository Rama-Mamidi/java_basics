package collectionprograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class Hash_Set 
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		//for(int i=0;i<100;i++)
		//{
		hs.add(35);
		hs.add(350);
		hs.add(450);
		hs.add(350);
		hs.add(0);
		hs.add(450);
		hs.add(12);
		//hs.add(i);
		hs.add("Rama");
		hs.add(null);
		hs.add(null);
		hs.add("Rama");
		hs.add('e');
		hs.add(6.98);
		hs.add(false);
		hs.add(true);
		//}
		
		System.out.println(hs);
		System.out.println(hs.size());
		//Collections.sort(hs);
		//System.out.println(hs);

		Iterator i1=hs.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		/*ListIterator li=hs.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}*/
	   }
}
