package com.day_6.Q1;

class Myjob implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {

			System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
		}
	}
}

class Multithreading {
	public static void main(String args[]) {
		Myjob job = new Myjob();

		Thread t1 = new Thread(job, "First");
		Thread t2 = new Thread(job, "Second");
		Thread t3 = new Thread(job, "Third");

		t1.start();
		t2.start();
		t3.start();

	}
}