package collectionprograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


 class LinkedList_Prgm 
{
   public static void main(String[] args)
   {
	LinkedList ll=new LinkedList();
	ll.add(35);
	ll.add(350);
	ll.add(450);
	ll.add(350);
	ll.add(0);
	ll.add(450);
	ll.add(false);
	ll.add(78.98);
	ll.add("Rama");
	ll.add(null);
	ll.add(null);
	ll.add("Rama");
	ll.add('e');
	
	System.out.println(ll);
	System.out.println(ll.size());
	/*//Collections.sort(ll);
	//System.out.println(ll);

	Iterator i1=ll.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	ListIterator li=ll.listIterator();
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
