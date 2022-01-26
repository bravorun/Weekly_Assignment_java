package com.day_6.Q2;

import java.util.Random;

class Myjob implements Runnable {

	private int sum;

	public Myjob() {
		this.sum =0;
	}

	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		Random random=new Random();
		int randomNumber =random.nextInt(10)+1;
		System.out.println("Number generated: " + randomNumber);
		synchronized (this) {
			sum += randomNumber;
		}
	}

}

public class Threading {

	public static void main(String[] args) {
		Myjob job = new Myjob();

		Thread t1 = new Thread(job, "A");
		Thread t2 = new Thread(job, "B");
		Thread t3 = new Thread(job, "C");
		Thread t4 = new Thread(job, "D");
		Thread t5 = new Thread(job, "E");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
		System.out.println("Sum of all random numbers of the threads are: " + job.getSum());
	}

}
