package com.collection;

	import java.util.*;
	public class Test04_Collection  {
	  public static void main(String[] args) {
	
	  List<String> animals = new ArrayList<String>();
	  animals.add("Lion");
	  animals.add("Tiger");
	  animals.add("Monkey");
	  animals.add("Deer");
	  animals.add("Cat");
	
	  System.out.println(animals);
		  animals.set(2, "Rat");
	 	  System.out.println(animals);
	 	  animals.remove(3);
	 	  System.out.println(animals);
	 	  Collections.reverse(animals);
	 	  System.out.println(animals);
	 }
	}