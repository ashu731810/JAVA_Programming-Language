package com.sathya.thread;

class MyThreadd extends Thread
{	@Override
	public void run() {
		System.out.println("Thread name..."+Thread.currentThread().getName());
		System.out.println("Thread priority..."+Thread.currentThread().getPriority());
	}
}
class ThreadDemo3
{	public static void main(String[] args) //main thread
	{	MyThreadd t1 = new MyThreadd();
		MyThreadd t2 = new MyThreadd();
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
