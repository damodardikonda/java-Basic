class ThreadS5 extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());
		System.out.println(" Newly Created Priority is"+Thread.currentThread().getPriority());
	}

}

class Thread_Priority{

	public static void main(String[] args) {
		
		ThreadS5 tt = new ThreadS5();
		tt.start();
		tt.setName("Damodar");
		tt.setPriority(7);

		//tt.setPriority(-9); Runtime Exception Priorities should not be negetive
		//tt.setPriority(11); Runtime Exception Priorities Should not be Greater then 10	

        System.out.println(Thread.currentThread().getName());
        System.out.println(ThreadS5.currentThread().getPriority());

	}

}