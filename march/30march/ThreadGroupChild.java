class T1 extends Thread{

	T1( ThreadGroup t1 , String s){

		super(t1,s);
	}

	T1(ThreadGroup t1 , ThreadGroup t2 , String s){

		super(t1,t2,s);
	}
	public void run(){

		System.out.println(Thread.currentThread().getName());
	}
}


class ThreadGP{

	public static void main(String[] args) {
		
		ThreadGroup tg = new ThreadGroup("Parent");
// Thread One chya athmadhe group banavlay
		ThreadGroup t1 = new ThreadGroup(tg ,"One");
			T1 t4 = new T1(tg,t1,"OneOne");
			T1 t5 = new T1(tg,t1,"OneTwo");
			T1 t6 = new T1(tg,t1,"OneThree");
// Thread One cha group end 

// Thread two 
		Thread t2 = new Thread(tg ,"Two");
		Thread t3 = new Thread(tg ,"Three");
		t4.start();
		t5.start();
		t6.start();
		t2.start();
		t3.start();
		try{
			t1.destroy();
		}catch(IllegalThreadStateException ie){

			System.out.println(" T1 delete zala");
		}

	}
}