class MultiThreadDemo extends Thread{

 	public void run(){

 		System.out.println(" In - Run");

 		String threadName = Thread.currentThread().getName();

 		System.out.println(" Thread Name  = " + threadName);
 	}
	public static void main(String[] args) {
		
		MultiThreadDemo mt = new MultiThreadDemo();
		mt.start();

		System.out.println(" MultiThreading");

		String threadName = Thread.currentThread().getName();

		System.out.println("Thread Name is = " + threadName);

	}
} 