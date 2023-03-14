package com.multithread;

public class MultiThread_Runnable implements Runnable {
@Override
	public void run() {
	System.out.println("In run ");
}
	public static void main(String[] args) {
MultiThread_Runnable mt = new MultiThread_Runnable();
Thread th = new Thread(mt);
th.start();
	}

}
