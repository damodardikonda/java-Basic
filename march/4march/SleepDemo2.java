class SleepDemo2 extends Thread{

	public void run() {

		System.out.println(Thread.currentThread().getName());

		for (int o = 0; o < 5 ; o++ ) {
			
			System.out.println("Child-Thread");
			
			try{
				sleep(1000);
			}catch (InterruptedException c){}
		}
	}
}

class ThreadDemoLast{

	public static void main(String[] args) {
		
		SleepDemo2 sd = new SleepDemo2();
		sd.start();

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("Main Thread");
		}
	}
}