package collectionprograms;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Linked_HashSet 
{

	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		//for(int i=0;i<100;i++)
		//{
		lhs.add(35);
		lhs.add(350);
		lhs.add(450);
		lhs.add(350);
		lhs.add(0);
		lhs.add(450);
		lhs.add(12);
		//lhs.add(i);
		lhs.add("Rama");
		lhs.add(null);
		lhs.add(null);
		lhs.add("Rama");
		lhs.add('e');
		lhs.add(6.98);
		lhs.add(false);
		lhs.add(true);
		//}
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		//Collections.sort(lhs);
		//System.out.println(lhs);

		Iterator i1=lhs.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		/*ListIterator li=lhs.listIterator();
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
