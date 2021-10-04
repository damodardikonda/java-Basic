public class Foothead extends Thread{
	
	public static void main(String[] args) {
		
		Foothead f = new Foothead();
		f.start();

		System.out.println("one");

         f.start();

		System.out.println("two");


	}


	public void run(){

		System.out.println("Thread");
	}
}