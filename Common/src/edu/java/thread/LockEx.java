package edu.java.thread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

//video: advance multi thread - 01
public class LockEx {
	
	/**
	 * @param args
	 */
	
	public static void showSema(){
		MyPool mypool = new MyPool(20);
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		MyThread2 t1 = new MyThread2("A", mypool,13);
		MyThread2 t2 = new MyThread2("B", mypool,12);
		threadPool.execute(t1);
		threadPool.execute(t2);
		
		threadPool.shutdown();
		
	}
	
	public static void showSema2(){
		Runnable runner = new Runnable(){
			Random ran = new Random();
			Semaphore signal = new Semaphore(3);
			public void run() {
				int time = ran.nextInt(10);
				try {
					signal.acquire();
					
					String name = Thread.currentThread().getName();
					System.out.println(name + "running, need to wait:"+time+"");
					Thread.sleep(time*1000);
					System.out.println(name+"finished");
					signal.release();
				} catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		for(int i = 0 ;i<10;i++){
			new Thread(runner).start();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showSema2();
		
	}

}

class MyPool {
	private Semaphore sp;
	// signal sum size
	MyPool(int size) {
		 this.sp = new Semaphore(size);
	}
	
	public Semaphore getSp() {
		return sp;
	}
	
	
}

class MyThread2 extends Thread {
	private String threadname;
	private MyPool pool;
	private int x;
	
	MyThread2(String threadname, MyPool pool, int x){
		this.threadname = threadname;
		this.pool = pool;
		this.x = x;
	}
	
	public void run() {
		try{
			pool.getSp().acquire(x);
			
			System.out.println(threadname + "success" + x +"permission");
			
			Thread.sleep(300);
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally{
			pool.getSp().release(x);
			System.out.println(threadname +" released"+x+" permission");
		}
	}
}