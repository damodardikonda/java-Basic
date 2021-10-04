class MyThread2 extends Thread{


	static Thread mainThread = null;

	public void run(){

		for (int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println("Chiuld Thread");

			try{

				mainThread.join();
			} catch(InterruptedException ie){

			}
		}
	}
}

class JoinRun{

	public static void main(String[] args) {
		
		MyThread2 mt = new MyThread2();
		mt.start();

		MyThread2.mainThread = Thread.currentThread();

		for (int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println("Main Thread");
		}
	}
}