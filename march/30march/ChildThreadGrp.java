class ThreadDC extends Thread{

	String i = null;
	ThreadDC( ThreadGroup tg , String i ){

		super(tg , i);
		this.i = i;
	}

	public void run(){

		System.out.println(Thread.currentThread().getName() + " task started " + i );

		try{

			Thread.sleep(3000);
		}catch (InterruptedException ie){

			System.out.println("Interrupted Exception Caught ");
		}

		System.out.println(Thread.currentThread().getName() + " task started " + i );

	}
}

class ChildThreadG{

	public static void main(String[] args) {
		
		ThreadGroup ptg = new ThreadGroup("Parent");
		ThreadGroup ctg1 = new ThreadGroup(ptg , "One");


		ThreadDC t1 = new ThreadDC(ctg1 , "1 ");
		ThreadDC t2 = new ThreadDC(ctg1 , "2" );
		ThreadDC t3 = new ThreadDC(ctg1 , "3" );

		System.out.println(ctg1.activeCount()); //0

		t1.start();
		t2.start();
		t3.start();


		System.out.println(ctg1.activeCount()); //3

		System.out.println(ctg1.getParent()); // it will proove that they have parent child relation.

	}
}