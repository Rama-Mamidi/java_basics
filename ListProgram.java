package collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProgram 
{
	
		public static void main(String[] args) 
		{
			List l1=new ArrayList();
			l1.add(35);
			l1.add(43);
			l1.add(120);
			/*l1.add("Manish");
			l1.add(null);
			l1.add(null);
			l1.add(true);
			l1.add("Manish");
			l1.add("Manish");
			System.out.println(l1);*/
			l1.add(25);
			l1.add(16);
			l1.add(true);
			l1.add(8.87);
			System.out.println(l1);
			//Collections.sort(l1);
			//System.out.println(l1);
			System.out.println("Forward Iteration using Iterator");
			Iterator i1=l1.iterator();
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			
			System.out.println("Forward Iteration using ListIterator");
			ListIterator i2=l1.listIterator();
			while(i2.hasNext())
			{
				System.out.println(i2.next());
			}
			System.out.println("Backward Iteration using ListIterator");
			
			while(i2.hasPrevious())
			{
				System.out.println(i2.previous());
			}
									
		}

	}
