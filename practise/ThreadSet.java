class MT extends Thread{
	static int a=0;
	static int b= 0 ;
	public void run(){

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println(Thread.currentThread().getName());

		}
		System.out.println(a);
		System.out.println(b);
	}
}

class ThreadSet {

	public static void main(String[] args) {
		
		MT m1 = new MT();
		MT m2 = new MT();
		m1.setPriority(8);

		m2.setPriority(5);

		m1.start();
		m2.start();

		m1.setName("Damodar");
		m2.setName("Dikonda");

		 MT.a = m1.getPriority();

		MT.b = m2.getPriority();

	}
}