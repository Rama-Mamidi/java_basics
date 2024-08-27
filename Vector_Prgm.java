package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Prgm 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.add(35);
		v1.add(350);
		v1.add(450);
		v1.add(350);
		v1.add("Rama");
		v1.add(null);
		v1.add(null);
		v1.add('e');
		v1.add(false);
		System.out.println(v1);
		//Collections.sort(v1);
		System.out.println("Iteration using Iterator");
		Iterator i1=v1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Iteration using ListIterator");
		System.out.println("---Forward---");
		ListIterator li=v1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("---Reverse---");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println("Iteration using Enumeration");
		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
