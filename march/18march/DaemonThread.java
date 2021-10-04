class DaemonThread extends Thread{

	public void run(){

		for (int i = 0 ; i < 5000 ; i++ ) {
			
			try{

				Thread.sleep(5000);
			}catch(InterruptedException ie){


			}

			System.out.println(Thread.currentThread().getName());
		}

	}
}

class DaemonDemo {

	public static void main(String[] args) {
		
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		DaemonThread dt3 = new DaemonThread();

		dt1.start();
		dt2.start();
		dt3.start();
	}
}