package com.sm;
//Modifying SM and NSM
public class NSM7 {
static int a=10;
static int b=20;
int x=30;
int y =40;

	public static void main(String[] args) {
NSM7 n1 = new NSM7();
NSM7 n2 = new NSM7();
NSM7 n3 = null;
n1.a=50;
n1.b=60;
n1.x=70;
n1.y=80;
System.out.println(a +" " +b);

System.out.println(n1.x +" " +n1.y);
System.out.println(n2.x +" " +n2.y);
	}

}
