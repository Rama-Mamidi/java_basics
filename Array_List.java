package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(35);
		al.add(350);
		al.add(450);
		al.add(350);
		al.add(0);
		al.add(450);
		al.add("Rama");
		al.add(null);
		al.add(null);
		al.add("Rama");
		al.add('e');
		System.out.println(al);
		/*Collections.sort(al);
		System.out.println(al);
	
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
		}*/
	}
	

}
