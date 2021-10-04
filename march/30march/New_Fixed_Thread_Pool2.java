import java.util.concurrent.*;
class T extends Thread{
	int i = 0;
	T(int i ){

		this.i = i;
	}

	public void run(){

		System.out.println(Thread.currentThread().getName() + " work started " + i);

		try{

			Thread.sleep(5000);
		}catch( InterruptedException ie){


		}

		System.out.println(Thread.currentThread().getName() + " End Thread " + i);
	}

}
class ThreadTP{

	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newFixedThreadPool(10);


		for (int i = 0 ; i < 20  ; i++ ) {
				
				T t1 = new T( i );
				exec.execute(t1);
			}	
	}
}