package com.exhandling;

public class ExHandling_Try_Catch_Finally {

	public static void main(String[] args) {
System.out.println(m1());
	}
static int m1() {
	try {
		System.out.println("In try");
		System.out.println(10/0);
	} catch (ArithmeticException e) {
		System.out.println("In catch");
	}
finally{
	System.out.println("In Finally");
}
return 20;
}
}
