package com.sm;
//static var initialization with same local name var
public class SM3 {
static int a = 10;
	public static void main(String[] args) {
		int a =50;
		a=a;
System.out.println(a);
System.out.println(SM3.a);

	SM3.a =a;
	System.out.println(a);
	}

}
