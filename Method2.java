package com.method;

public class Method2 {
boolean  isEven(int num) {
	if (num%2==0) {
		return true;
	}
	return false;
}
	public static void main(String[] args) {
Method2 m2 = new Method2();
 boolean  number = m2.isEven(10);
System.out.println(number);
	}

}
