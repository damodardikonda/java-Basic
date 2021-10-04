class Mythread implements Runnable{

	public void run(){

		System.out.println(Thread.currentThread().getName());
	}
}

class RunnableSimple{

	public static void main(String[] args) {
		
		Mythread mt = new Mythread();
		Thread t = new Thread(mt);
		t.start();
	}
}