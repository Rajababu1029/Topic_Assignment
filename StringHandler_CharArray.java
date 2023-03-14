package com.stringhandler;

import java.util.Arrays;  
public class StringHandler_CharArray {
	static String s1 ="Singh";
    public static void main(String[] args) {  
    	
        char[] CharArray = {'a', 'e', 'i', 'o', 'u'}; 
        char[] name = s1.toCharArray();
        for (int i = 0; i <name.length; i++) {
        	   System.out.println(name[i]);	
		}
     
         System.out.println(Arrays.toString(CharArray));  
         System.out.println(CharArray.length);
        }  
        }
