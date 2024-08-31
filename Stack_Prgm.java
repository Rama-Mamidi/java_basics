package collectionprograms;

import java.util.Collections;
import java.util.Enumeration;
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
		System.out.println("Iteration through Iterator");
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Iteration through ListIterator");
		ListIterator li=s1.listIterator();
		System.out.println("Iteration in forward direction");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("Iteration in backward direction");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		Enumeration e1=s1.elements();
		System.out.println("Iteration through Enumeration");
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	   }
}
