package com.stringhandler;

import java.util.Scanner;

public class StringHandling_Concate {
static void ConcateString(String name1 , String name2) {
	 String name =	name1.concat(name2);
	 System.out.println(name);
}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String:-");
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		ConcateString(s1, s2);
		
	}

}
