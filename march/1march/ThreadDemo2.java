class ThreadS4 extends Thread{

	public void start(){

		System.out.println("This is Start Method");
	}
/*
	public void run(){                                                             This willl Not Print

		System.out.println(" This Is Run method");
	}
*/}


class ThreadDemo2 {

	public static void main(String[] args) {
		
		ThreadS4 ts = new ThreadS4();
		ts.start();

		System.out.println(Thread.currentThread().getName());

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("Main Method");
		}
	}
}