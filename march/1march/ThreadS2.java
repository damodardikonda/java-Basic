class ThreadS2 extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("Core2web");
		}
	}


	public static void main(String[] args) {
		

		ThreadS2 t = new ThreadS2();
		t.run();

	    System.out.println(Thread.currentThread().getName());

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("C2w");
		}	
	}
}