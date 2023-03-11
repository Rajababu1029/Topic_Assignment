package com.sm;
//static block
public class SM4 {
static int p = m1();
static int m1() {
	System.out.println("In m1 ");
	return 50;
}
static {
	System.out.println("In static Block 1");
}
	public static void main(String[] args) {
		System.out.println("In Main Method");
	}
	static {
		System.out.println("In static block 2");
	}

}
