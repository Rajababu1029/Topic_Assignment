package com.stringhandler;

public class StringHandler_SBuffer {

	public static void main(String[] args) {
StringHandler_SBuffer sbuffer = new  StringHandler_SBuffer();
	
	StringBuffer sb = new StringBuffer("Satish");
	sb.append("Raja");
	System.out.println(sb);
	sb = new StringBuffer("Nitin");
	System.out.println(sb);
	System.out.println( sb.replace(1, 0, "Raja"));
	
	


	}

}
