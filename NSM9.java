package com.sm;
//Non static block Execution flow 
public class NSM9 {
	{
		System.out.println("In NSB-1");
	}
	public NSM9() {
	System.out.println("In arg-no param constructor");	
	}
	public NSM9(int x ) {
		System.out.println("In arg-int constructor ");
	}
	{
		System.out.println("In NSB-2");
	}
	public static void main(String[] args) {
NSM9 n1 = new NSM9();
NSM9 n2 = new NSM9(10);
	}

}
