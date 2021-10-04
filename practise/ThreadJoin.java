class MyThread2 extends Thread{

	static Thread mainThread = null;

	public void run(){

		try{

			mainThread.join();
		}catch(InterruptedException ir){}

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("Child thread");
		}
	}
}

class MainTRhreading{

	public static void main(String[] args) throws InterruptedException{
		
		MyThread2 mt = new MyThread2();
		mt.start();
		
		MyThread2.mainThread = Thread.currentThread();
		mt.join();
		
		for (int  i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("Parent ");
		}
	}
}