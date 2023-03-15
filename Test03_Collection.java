package com.collection;

import java.util.*;
public class Test03_Collection {
    public static void main(String args[]) {
     
    	HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(3);
        hs.add(17);
        hs.add(6);
        hs.add(9);
        hs.add(7);

        if (hs.contains(6)) {
            System.out.println("6 was found in the list");
        } else {
            System.out.println("6 was not found in the list");
        }
   System.out.println( hs.isEmpty());
    }
    
}
