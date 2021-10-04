class Thread1 extends Thread{

	static Thread mainThread = null;
	public void run(){

		for (int i = 0 ; i < 10 ; i++) {
			try{

				mainThread.join();
			}catch(InterruptedException ir){

			}
			System.out.println("Child1-Thread");
		}
	}

}

class AvoidDeadlock{

	public static void main(String[] args) throws InterruptedException  {
		
		Thread1 t1 = new Thread1();
		t1.start();

		Thread2 t2 = new Thread2();
		t2.start();
		
        Thread1.mainThread = Thread.currentThread();
        Thread2.mainThread2 = Thread.currentThread();
        t1.join();
        t2.join();



        for (int i = 0 ; i < 10 ; i++ ) {
        	
        	System.out.println("main Thread");
        }
	}
}

class Thread2 extends Thread{

	static Thread mainThread2 = null ; 

	public void run(){

		for (int i = 0 ; i < 10 ; i++ ) {
			
			try{

				mainThread2.join();
			}catch(InterruptedException ie){}

			System.out.println("Child2-Thread");
		}
	}
}