class SetDeamonThread extends Thread{

	public void run(){

		for (int  i = 0 ; i < 5000 ; i++ ) {
			
			try{

				Thread.sleep(5000);

			}catch(InterruptedException ie) {}

			System.out.println(Thread.currentThread().getName());
		}
	}
}

class DeamonDemo{

	public static void main(String[] args) {
		
		SetDeamonThread sdt = new SetDeamonThread();

		SetDeamonThread sdt2 = new SetDeamonThread();

		SetDeamonThread sdt3 = new SetDeamonThread();	


		sdt.setDaemon(true);

		
		sdt.start();

		sdt2.start();

		sdt3.start();	
	}
}