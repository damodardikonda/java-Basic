class Mythread extends Thread{

	static Thread mainThread = null;

	public void run(){

		try{

			mainThread.join();

		} catch(InterruptedException ie){ }

		for (int i = 1 ; i < 10 ; i++ ) {
			
			System.out.println(" Child-Thread");
		}
	}
}

class Deadlock {

	public static void main(String[] args) throws InterruptedException  {
		
		Mythread mt = new Mythread();
		mt.start();
		
		Mythread.mainThread = Thread.currentThread();
		mt.join();

		for (int i= 0 ; i < 10 ; i++ ) {
			
			System.out.println("Main-Thread");
		}
	}
}