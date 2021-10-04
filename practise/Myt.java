class MyThread extends Thread{
	
	public void run(){

		for (int i = 0 ; i < 5 ; i++ ) {
			
		
		System.out.println(Thread.currentThread().getName());
	}
}
}
class T{

	public static void main(String[] args) {
		
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();

		m1.start();
		m2.start();

		for ( int i = 0 ; i < 10 ; i++) {
			
		
		System.out.println(Thread.currentThread().getName());
	}}
}