package collectionprograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_Prgm 
{

	public static void main(String[] args)
	   {
		Stack s1=new Stack();
		
		s1.addElement(35);
		s1.add(350);
		s1.add(450);
		s1.add(350);
		s1.add(0);
		s1.add(450);
		s1.add(false);
		s1.add(6.98);
		/*s1.add("Rama");
		s1.add(null);
		s1.add(null);
		s1.add("Rama");
		s1.add('e');*/
		
		System.out.println(s1);
		System.out.println(s1.size());
		//Collections.sort(s1);
		//System.out.println(s1);

		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator li=s1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	   }
}
