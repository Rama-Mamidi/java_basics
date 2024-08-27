package collectionprograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Priority_Queue 
{
	public static void main(String[] args)
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(35);
		pq.add(350);
		pq.add(450);
		pq.add(350);
		pq.add(0);
		pq.add(450);
		pq.add(12);
		
		//pq.add("Rama");
		//pq.add(null);
		//pq.add(null);
		//pq.add("Rama");
		//pq.add('e');
		
		System.out.println(pq);
		System.out.println(pq.size());
		//Collections.sort(pq);
		//System.out.println(pq);

		Iterator i1=pq.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		/*ListIterator li=pq.listIterator();
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
