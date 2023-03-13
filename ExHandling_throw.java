package com.exhandling;

import java.util.Scanner;

//
public class ExHandling_throw {
static void add(int a, int b) throws ArithmeticException {
	if (a<=0 || b<=0) {
		throw new ArithmeticException("Enter vale greater than zero");
	}
	int c=a+b;

	System.out.println(c);
}
	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
System.out.println("Enter the value:-");
 int num1 =scn.nextInt();
 int num2 =scn.nextInt();
 ExHandling_throw et = new ExHandling_throw();
 et.add(num1, num2);
	}

}
