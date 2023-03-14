package com.multithread;

public class MultiThread_getName extends Thread {
public MultiThread_getName() {
super();
}

public MultiThread_getName(String name) {
super(name);
}

@Override
public void run() {
	for (int i = 0; i <=20; i++) {
		System.out.println(getName()+ "i:-"+i);
	}
}
	public static void main(String[] args) {
MultiThread_getName mt1 = new MultiThread_getName();
MultiThread_getName mt2 = new MultiThread_getName("Mythread");
System.out.println(mt1.getName());
System.out.println(mt1.getPriority());

mt1.start();
	}

}
