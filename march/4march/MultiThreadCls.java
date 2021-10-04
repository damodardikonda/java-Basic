class MultiThread1 extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());
	}

}

class MultiThread2 extends Thread{

 	public void run(){

 		System.out.println(Thread.currentThread().getName());

 		MultiThread1 mt = new MultiThread1();
 		mt.start();
 	}

 }

 class MultiThreadCls{

 	public static void main(String[] args) {
 		
 		MultiThread2 mt2 = new MultiThread2();
 		mt2.start();

 		System.out.println(Thread.currentThread().getName());
 	}
 }