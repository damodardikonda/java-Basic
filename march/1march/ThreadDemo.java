class ThreadS1 extends Thread{

	public void run() {
		
		System.out.println(Thread.currentThread().getName());

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("Core2web");
		}
	}

}

class ThreadDemo{

	public static void main(String[] args) {
		
		ThreadS1 t = new ThreadS1();
		t.start();

		System.out.println(Thread.currentThread().getName());

		for (int i = 0 ; i < 5  ; i++ ) {
			
			System.out.println("Biencaps");
		}
	}
}