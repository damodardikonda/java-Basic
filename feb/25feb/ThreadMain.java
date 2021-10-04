class ThreadDemo extends Thread{

    public void run(){

    	System.out.println(Thread.currentThread().getName());

    	for (int i = 0 ; i < 10  ; i++ ) {
    		
    		System.out.println("Core2web");
    	}
    }
}

class ThreadMain{

  public static void main(String[] args) {
  	
  	ThreadDemo td = new ThreadDemo();
  	td.start();

  	System.out.println(Thread.currentThread().getName());

    	for (int i = 0 ; i < 10  ; i++ ) {
    		
    		System.out.println("Biencaps");
    	}	
  }
}