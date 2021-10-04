
class ThreadGrp extends Thread{

	ThreadGrp(ThreadGroup td , String s){

		super(td,s);
	}
	public void run(){

		System.out.println(Thread.currentThread().getName());

		try{

			Thread.sleep(3000);
		}catch (InterruptedException ie){}
	}
}

class ThreadActive{

	public static void main(String[] args) {
		
		ThreadGroup td = new ThreadGroup("Parent ");

		ThreadGrp t1 = new ThreadGrp(td , "One");
		ThreadGrp t2 = new ThreadGrp(td , "Two");
		ThreadGrp t3 = new ThreadGrp(td , "Three");

		System.out.println(td.activeCount());

		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(td.activeCount()	);

	}
}