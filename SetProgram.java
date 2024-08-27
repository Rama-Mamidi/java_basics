package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetProgram 
{
	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add("ramya");
		s1.add("swathi");
		s1.add("utkarsha");
		s1.add("sandhya");
		s1.add("ramya");
		s1.add(null);
		s1.add(null);
		s1.add(98);
		s1.add(76);
		s1.add(87);
		System.out.println(s1);
	}
	
}
