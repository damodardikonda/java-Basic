import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ThreadDemo extends Thread{

	int workNum = 0;
/*
	ThreadDemo(String workNum){

		this.workNum = workNum;
	}
*/
	ThreadDemo(int num )
	  {workNum = num;}
	public void run(){

		System.out.println(Thread.currentThread().getName() + "Task Start " + workNum);

		try{
				Thread.sleep(3000);
		}catch(InterruptedException ie){}

		System.out.println(Thread.currentThread().getName() + " End Task " );
	}

}
class MyThread{

	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newFixedThreadPool(10);

		for (int i = 0 ; i < 10 ; i++ ) {
		
			ThreadDemo work = new ThreadDemo(i);	
			exec.execute(work);
		}

		exec.shutdown();

		/* kaanpatta deu ka lawdu shutdown kel ahes na . pool madhun sarva thread delete zalet;u
		for (int i = 0 ; i < 10 ; i++ ) {
		
			ThreadDemo work = new ThreadDemo(" " + i);	
			exec.execute(work);
		}
		*/

	}
}