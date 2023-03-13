package com.sm;

//SM & NSM execution flow
public class NSM10 {
static int a= m1();
static int m1() {
	System.out.println("In m1 ");
	return 10;
}
 public NSM10() {
System.out.println("In arg-no param Constructor");	 
 }
public NSM10(int p) {
	super();
	System.out.println("In arg-int Constructor");
}
 
static {
	System.out.println("In static Block");
}
void m2 () {
	System.out.println("In m2 ");
}
{
	System.out.println("In non-static block");
	}


	public static void main(String[] args) {
NSM10 n1 = new NSM10();
NSM10 n2 = new NSM10(50);

	}

}
