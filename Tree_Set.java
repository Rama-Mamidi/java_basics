package collectionprograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Tree_Set
{
	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		//for(int i=0;i<100;i++)
		//{
		ts.add(35);
		ts.add(350);
		ts.add(450);
		ts.add(350);
		ts.add(0);
		ts.add(450);
		ts.add(12);
		ts.add(2147483647);
		
		//ts.add(i);
		//ts.add("Rama");
		//ts.add(null);
		//ts.add(null);
		//ts.add("Rama");
		//ts.add('e');
		//ts.add(6.98);
		//ts.add(false);
		//ts.add(true);
		//}
		
		System.out.println(ts);
		System.out.println(ts.size());
		//Collections.sort(ts);
		//System.out.println(ts);

		Iterator i1=ts.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		/*ListIterator li=ts.listIterator();
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
