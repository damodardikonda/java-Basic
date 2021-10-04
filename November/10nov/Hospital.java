class ospital{

    int x = 20;
    static int y = 20;

	static class Doctor{

       int p = 100;
       int q = 200;
		void serviceAt(){

			System.out.println("Work At Hospital");
			
            ospital h = new ospital();
			System.out.println(h.x);
			System.out.println(y);
			System.out.println(p);
			System.out.println(q);
		}
	}

	public static void main(String[] args) {
		
		Doctor d =new Doctor();
		d.serviceAt();
	}
}