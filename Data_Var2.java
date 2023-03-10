package com.var;
//instance variable
public class Data_Var2 {
float x = 40f;
float y=20f;
float z = x-y;
public static void main(String[] args) {
	Data_Var2 dv = new Data_Var2();
	System.out.println(dv.x);
	System.out.println(dv.y);
	
	System.out.println(dv.z);
}
}
