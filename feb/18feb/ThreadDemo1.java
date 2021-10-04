class ThreadDemo1{

	public static void main(String[] args) {
		
		System.out.println("Multithreading");

		String threadName = Thread.currentThread().getName();

		System.out.println(" Thread Name is = " +  threadName);
	}
}