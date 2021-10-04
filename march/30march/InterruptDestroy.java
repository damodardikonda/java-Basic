import java.util.concurrent.*;
class ThreadID extends Thread{
	ThreadID(ThreadGroup td , String s){

		super(td,s);
	}
	public void run(){

		System.out.println(Thread.currentThread().getName());

		try{

			Thread.sleep(3000);
		}catch (InterruptedException ie){

			System.out.println("Its Interrupted");
		}
	}
}
class InterruptDestroy{

	public static void main(String[] args) {
		
	ThreadGroup td = new ThreadGroup("Parent");

	ThreadID t1 = new ThreadID(td ,"One");
	ThreadID t2 = new ThreadID(td , "Two");
	ThreadID t3 = new ThreadID(td , "Three");
	
	t1.start();
	t2.start();
	t3.start();
		td.interrupt();
	try{td.destroy();//destroying threadpool
	}catch(IllegalThreadStateException ie){}\

	}
}