class ST extends Thread{

	public void run(){

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println("Damodar");
	
	/*	try{
			sleep(2000);
		}catch(InterruptedException ie){}
		
	*/
		}
	}
}

class ThreadSleep{

	public static void main(String[] args) throws InterruptedException{
		
		ST st = new ST();
		st.start();
		st.yield();
		for (int i = 0 ; i < 5 ; i++ ) {
	//		Thread.sleep(2000);
			System.out.println("Dikondas");
		}

	}
}