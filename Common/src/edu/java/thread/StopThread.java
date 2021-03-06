package edu.java.thread;

public class StopThread {


	public static void main(String[] args) throws InterruptedException {
		CanStopRunner runner = new CanStopRunner();
		Thread t = new Thread(runner);
		t.start();
		Thread.sleep(100);
		runner.stop();
	}

}

class CanStopRunner implements Runnable {
	private boolean stop = false;
	
	public void run() {
		while(!stop){ // the sign is for stop
			System.out.println("thread is running...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void stop() {
		stop = true;
	}
	
}
