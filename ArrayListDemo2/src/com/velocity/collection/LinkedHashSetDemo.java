package com.velocity.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("four");
		set.add("Five");
		
		Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
	}

}
