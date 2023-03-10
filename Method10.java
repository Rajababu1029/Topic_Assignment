package com.method;
//method overloading
public class Method10 {
	
void m1(int x ) {
System.out.println(x);
}
void m1(float x) {
System.out.println(x);	
}
void m1(String s1) {
System.out.println(s1);	
}

	public static void main(String[] args) {
Method10 m10 = new Method10();
m10.m1(5);
m10.m1(10f);
m10.m1(null);
	}

}
