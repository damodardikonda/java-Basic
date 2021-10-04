class Thread2 extends Thread{

    public void gun(){

    	System.out.println("hiiiii");
    }

	public static void main(String[] args) {
		
       Thread2 t = new Thread2();
       t.start();

	}

}

/// No Output