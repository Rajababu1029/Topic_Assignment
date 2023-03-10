package com.method;

import java.util.Scanner;

public class Method4 {
public int isodd( int num) {
	if (num%2==1) {
		System.out.println(num+" "+" is odd number");
			}
	
	return num;
}

	public static void main(String[] args) {
Method4 m4 = new Method4();
Scanner scn = new Scanner(System.in);
System.out.print("Enter the number:- ");
int number = scn.nextInt();
m4.isodd(number);
	m4.isodd(0);

	}

}
