package com.sm;
//Variable Shadowing
public class SM1 {
static long l1 =100;
static long l2=200;
 static void m1() {
	
}
	public static void main(String[] args) {
System.out.println(l1);
System.out.println(l2);

long l1 =50;
long l2 =70;
System.out.println(l1);
System.out.println(l2);
	}

}
