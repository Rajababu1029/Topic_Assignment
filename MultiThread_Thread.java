package com.multithread;

public class MultiThread_Thread extends Thread{
@Override
public void run() {
	System.out.println("In run Method");
	for (int i = 0; i <50; i++) {
		System.out.println("In run :-"+i);
	}
}
	public static void main(String[] args) {

MultiThread_Thread mt = new MultiThread_Thread();
mt.start();
for (int i = 0; i <50; i++) {
System.out.println("In main:-"+i);	
}
		
	}

}
