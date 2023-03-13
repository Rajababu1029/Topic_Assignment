package com.sm;
//Constructor Overloading 
public class NSM8 {
public NSM8() {
	System.out.println("In no-arg Constructor");
}
public NSM8(int x ) {
System.out.println("In arg-Int Constructor ");	
}
public NSM8(String s) {
System.out.println("In  arg-String Constructor ");	
}

	public static void main(String[] args) {
NSM8 n1 = new NSM8();
NSM8 n2 = new NSM8(50);
NSM8 n3 = new NSM8("Ravi");
	}

}
