package com.method;
//Local object creation
public class Method9 {
double x= 20;
double y=30;
 
void m1() {
	Method9 m9 = new Method9();
	m9.x=40;
	m9.y=50;
	System.out.println("X:"+m9.x);
	System.out.println("Y:"+m9.y);
}
	public static void main(String[] args) {
Method9 m = new Method9();
m.x=60;
m.y=70;
System.out.println("X:-"+m.x);
System.out.println("Y:-"+m.y);
m.m1();
System.out.println("X:-"+m.x);
System.out.println("Y:-"+m.y);
	}

}
