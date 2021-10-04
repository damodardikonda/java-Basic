class MT extends Thread{

	public void run(){

		for (int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println("Child-Thread");
		}
	}
}

class YieldThread{

	public static void main(String[] args) {
		
		MT m = new MT();
		m.start();
		m.yield();

		for (int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println("Main Thread");
		}
	}
}