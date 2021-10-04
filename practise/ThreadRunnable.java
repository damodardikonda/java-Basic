class Threadd implements Runnable{

	public void run(){

		System.out.println(Thread.currentThread().getName());
	}

}

class MM{

	public static void main(String[] args) {
		
		Threadd tt = new Threadd();
		Thread t1 = new Thread(tt);
		t1.start();
	}
}