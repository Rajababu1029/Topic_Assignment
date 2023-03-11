package com.sm;

public class SM5 {
private int sno;
private String sname;
private static String collegeName="NIT";
SM5( int no,  String name){
	sno=no;
	sname=name;
}
void display() {
	System.out.println("Sno :-"+sno);
	System.out.println("Sname :-"+sname);
	System.out.println("CollegeName :-"+collegeName);
	
}
	public static void main(String[] args) {
		SM5 s5 = new SM5(101, "Hari");
		SM5 s55 = new SM5(201, "Krishna");
		s5.display();
		s55.display();
	}

}
