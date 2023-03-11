package com.sm;
//instance object modification
public class NSM6 {
int x=10;
int y=20;
	public static void main(String[] args) {
		
NSM6  n1 = new NSM6();
NSM6  n2 = new NSM6();
System.out.println(n1.x + " " + n1.y);
System.out.println(n2.x + " " + n2.y);
n2.x=50;
n2.y=60;
System.out.println(n1.x + " " + n1.y);
System.out.println(n2.x + " " + n2.y);


	}

}
