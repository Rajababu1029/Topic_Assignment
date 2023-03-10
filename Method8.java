package com.method;

public class Method8 {
	String s1 = "abhi";
	String s2 ="sam";
	void m1 () {
		s1="roshan";
		s2="deepak";
	}
	void m3() {
		System.out.println("Value of s1:-"+s1);
		System.out.println("Value of s2:-"+s2);
	}
	void m2() {
		m1();
		m3();
	}
	public static void main(String[] args) {
 Method8 m8 = new Method8();
 m8.m2();
	}

}
