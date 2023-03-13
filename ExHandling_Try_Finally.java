package com.exhandling;

public class ExHandling_Try_Finally {

	public static void main(String[] args) {
try {
	System.out.println("In try");
	System.out.println(10/0);
} finally {
	System.out.println("In Finally");
}
System.out.println("After try/finally");
	}

}
