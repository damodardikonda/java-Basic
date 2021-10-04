import java.util.concurrent.*;


class TTT extends Thread{

		int i = 0 ;
		TTT(int i){

			this.i = i ;
		}

		public void run(){

			System.out.println(Thread.currentThread().getName() + " Starting thread " + i);

			try{

				Thread.sleep(2000);
			}catch(InterruptedException ie){}
	
			System.out.println(Thread.currentThread().getName() + " Ending thread " + i);
	
	}
}
class CatchedThread {

	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newCachedThreadPool();

		for (int  i = 0 ; i < 20 ; i++ ) {
			
			ThreadInJava tij = new ThreadInJava(i);
			exec.execute(tij);
		}

		exec.shutdown();
	
	}
}