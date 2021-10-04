class MultiThread extends Thread{

	public void run(){

		System.out.println("In Run Method");

		System.out.println(Thread.currentThread().getName());
	}
}

class MultipleThread {

	public static void main(String[] args) {
		
		MultiThread mt = new MultiThread();
		mt.start();

		System.out.println(Thread.currentThread().getName());

		MultiThread mt1 = new MultiThread();
		mt1.start();

		MultiThread mt2 = new MultiThread();
		mt2.start();

		MultiThread mt3 = new MultiThread();
		mt3.start();
	}
}