package com.exhandling;
//Checked Exception 
public class ExHandling_CheckedExp {
void m1() {
	try {
		throw new InterruptedException();
	} catch (InterruptedException e) {
		System.out.println(e.getMessage());
	}
}
	public static void main(String[] args) {
ExHandling_CheckedExp e1 = new ExHandling_CheckedExp();
e1.m1();
	}

}
