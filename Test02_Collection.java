package com.collection;

import java.util.*;
public class Test02_Collection {
    public static void main(String args[]) {
      
        ArrayList<Integer> al = new ArrayList<>();
    
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
       
        if (al.contains(10)) {
            System.out.println("10 was found in the list");
        } else {
            System.out.println("10 was not found in the list");
        }
    }
}
