package com.method;

import java.util.Scanner;

public class Method7 {
void isLeapyear(long year) {
	if (year%4==0  && year%100!=0) {
	System.out.println("It is Leap year");	
	}
	else {
		System.out.println("Not a Leap Year");
	}
}
	public static void main(String[] args) {
Method7 m7 = new Method7();
Scanner scn = new Scanner(System.in);
System.out.println("Enter the year:-");
long year = scn.nextLong();
m7.isLeapyear(year);
	}

}
