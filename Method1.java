package com.method;

public class Method1 {
double getTotal(double d1 , double d2) {
	double sum = d1+d2;
	System.out.println(sum);
	return sum;
}
	public static void main(String[] args) {
Method1 m1 = new Method1();
m1.getTotal(10, 20);
	}

}
