package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test05_Collection_Iterator {

	public static void main(String[] args) {
ArrayList<Object> subject = new ArrayList<>();
subject.add("Maths");
subject.add("Physics");
subject.add("Chemistry");
subject.add("Biology");
subject.add("Sanskrit");
subject.add("English");
//1st way to retrieve
Iterator<Object> sub = subject.iterator();
while (sub.hasNext()) {
	Object obj = sub.next();
	System.out.println(obj);

}

System.out.println();

LinkedHashSet<Object> lhs = new LinkedHashSet<>();
lhs.add(null);
lhs.add(10);
lhs.add(20);
lhs.add(30);
lhs.add(40);
lhs.add(50);
Iterator num = lhs.iterator();
// 2nd way to retrieve
displayObjects(lhs);
	}
private static void displayObjects(Collection<Object> c) {
	
	Iterator<Object> itr = c.iterator();
	while (itr.hasNext()) {
		Object obj = itr.next();
		System.out.println(obj);
	}

	}

}
	
