package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Program {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Rama");
		al.add(78);
		al.add(98);
		al.add(350);
		al.add(350);
		al.add(0);
		al.add(5);
		al.add(null);
		al.add(null);
		al.add(false);
		al.add(9.88);
		System.out.println(al);
		//Collections.sort(al);
		Iterator i1=al.iterator();
		while(i1.hasNext())
		{
		System.out.println(i1.next());
		}
		ListIterator li=al.listIterator();
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
