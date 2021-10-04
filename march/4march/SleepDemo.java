class SleepDemo extends Thread{
	
	public void run(){


		System.out.println(Thread.currentThread().getName());

		for (int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println("Child - Run");
		}
	}
}

class ThreadDemo{

	public static void main(String[] args) throws InterruptedException {
		
		SleepDemo sd = new SleepDemo();
		sd.start();
        
        sd.sleep(3000);

		System.out.println(Thread.currentThread().getName());
		
		for (int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println("Main-Thread");
		}
	}
}