import java.util.concurrent.*;
class Threadss implements Runnable{

	int n =0;
	Threadss(int i ) {

		n = i;
	}

	public void run(){

		System.out.println(Thread.currentThread().getName() + " Start Task " + n );

		try{

			Thread.sleep(3000);
		}catch(InterruptedException ee){}
	}
}
class SingleThread{

	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newSingleThreadExecutor();

		for (int i = 0 ; i < 20 ; i++ ) {
			
			Threadss ts = new Threadss(i);
			exec.execute(ts);
		}

		exec.shutdown();
	}
}