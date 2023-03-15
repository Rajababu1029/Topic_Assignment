package com.collection;

import java.util.ArrayList;

// Converting ArrayList to String Array
public class Test01_Collection {

	public static void main(String[] args) {
ArrayList<String> colours = new ArrayList<>();
colours.add("red");
colours.add("blue");
colours.add("green");
colours.add("orange");
colours.add("grey");
colours.add("black");
 String[] clr = new String[colours.size()];
	for (int i = 0; i < colours.size(); i++) {
		clr[i]=colours.get(i);
	}
	for (int i = 0; i < clr.length; i++) {
	System.out.println(clr[i]);	
	}
	
	}

}
