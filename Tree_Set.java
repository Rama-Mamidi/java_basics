package collectionprograms;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Tree_Set
{
	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add(35);
		ts.add(350);
		ts.add(450);
		ts.add(350);
		ts.add(0);
		//ts.add("Rama");//These all commented values are not applicable
		//ts.add(null);
		//ts.add(6.98);
		//ts.add(false);
			
		System.out.println(ts);
		//Collections.sort(ts); Collections not applicable to TreeSet
		//System.out.println(ts);

		Iterator i1=ts.iterator();//ListIterator and Enumeration are not applicable to TreeSet
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	 }

}
