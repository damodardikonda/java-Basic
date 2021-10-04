class ThreadS3 extends Thread{
	
	public void run(){

		System.out.println(Thread.currentThread().getName());

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("Core2web");
		}
	}


	public void run(int x){

		System.out.println(Thread.currentThread().getName());

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("Bielearn");
		}
	}


	public static void main(String[] args) {
		
		ThreadS3 tt = new ThreadS3();
        tt.run();
        tt.run(10);
	}
}


