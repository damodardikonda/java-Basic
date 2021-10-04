class IsDeamonThread extends Thread{

	public void run(){

		if(Thread.currentThread().isDaemon()){

			System.out.println(getName() + " is daemo0n thread");
		}else
				System.out.println(getName() + " is not a daemo0n thread");
		

	}
}

class DeamonDemo2{

	public static void main(String[] args) {
		
		IsDeamonThread sdt = new IsDeamonThread();

		IsDeamonThread sdt2 = new IsDeamonThread();

		IsDeamonThread sdt3 = new IsDeamonThread();	


		sdt.setDaemon(true);

		
		sdt.start();

		sdt2.start();

		sdt3.start();	
	}
}