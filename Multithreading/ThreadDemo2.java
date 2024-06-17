package com.sathya.thread;

class MytThrea extends Thread
{	@Override
	public void run() {
		for (int i = 1; i <= 10; i++){
			System.out.println("My number...."+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
class ThreadDemo2
{	public static void main(String[] args) //main thread
	{	MytThrea t1 = new MytThrea();
		t1.start();	// user thread 
	}
}