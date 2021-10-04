import java.util.concurrent.*;
class ThreadInJava extends Thread{

		int i = 0 ;
		ThreadInJava(int i){

			this.i = i ;
		}

		public void run(){

			System.out.println(Thread.currentThread().getName() + " Starting thread " + i);

			try{

				Thread.sleep(2000);
			}catch(InterruptedException ie){}
		}
}
class ThreadPools{

	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newFixedThreadPool(10);

		for (int  i = 0 ; i < 10 ; i++ ) {
			
			ThreadInJava tij = new ThreadInJava(i);
			exec.execute(tij);
		}

		exec.shutdown();
	
	/*	for (int  i = 0 ; i < 10 ; i++ ) {
			
			ThreadInJava tij = new ThreadInJava(i);
			exec.execute(tij);
		}
	*/}
}