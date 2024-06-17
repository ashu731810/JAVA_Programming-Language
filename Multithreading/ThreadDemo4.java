package com.sathya.thread;

class MyThreaddd extends Thread
{	@Override
	public void run() {
		System.out.println("Thread name..."+Thread.currentThread().getName());
		System.out.println("Thread priority..."+Thread.currentThread().getPriority());
	}
}
class ThreadDemo4
{	public static void main(String[] args) //main thread
	{	MyThreaddd t1 = new MyThreaddd();
		MyThreaddd t2 = new MyThreaddd();
		t1.setPriority(10);
		t1.setName("worker-1");
		
		t2.setPriority(1);
		t2.setName("worker-2");
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("manager");
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
