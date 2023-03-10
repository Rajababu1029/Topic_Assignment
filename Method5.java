package com.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method5 {
void averageNum(double x,double y,double z){
double average =	(x+y+z)/3;
System.out.println(average);
}
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the numbers:-");
	int num1 =Integer.parseInt(br.readLine());
	int num2 =Integer.parseInt(br.readLine());
	int num3 =Integer.parseInt(br.readLine());
	Method5 m5 = new Method5();
	m5.averageNum(num1, num2, num3);
		}

}
