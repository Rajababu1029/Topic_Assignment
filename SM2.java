package com.sm;
//static variable and main method execution flow
public class SM2 {
static int a = m1();
static int m1() {
	System.out.println("M1 is executed ");
return 10;
		}
	public static void main(String[] args) {
		
System.out.println("a value:-"+a);
System.out.println("b value:-"+b);
	}
	static int b = m2();
	static int m2() {
		System.out.println("M2 is executed ");
	return 20;
			}

}
