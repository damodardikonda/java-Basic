import java.io.*;

class InterruptDemo{

	public static void main(String[] args) throws InterruptedException{
		
		Thread t = new Thread();
		t.start();

		System.out.println(" Thread 1 ");
		t.sleep(5000);
		System.out.println(" Thread 2 ");
	}
}