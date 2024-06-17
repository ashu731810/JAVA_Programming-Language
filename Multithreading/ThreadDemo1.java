package com.sathya.thread;

class MyThread extends Thread
{	@Override
	public void run() {
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("USer defiend thread hai ye");
		}
	}
}
class ThreadDemo1
{	public static void main(String[] args) //main thread
	{	MyThread t1 = new MyThread();
		t1.start();					// user thread 
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("Main thread hai ye");
		}
	}
}