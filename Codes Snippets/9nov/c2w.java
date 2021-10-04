class c2w{

         static int k = 0;
	public static void main(String[] args) {
		
		
		c2w c = new c2w();

		for (int  i = 0 ; i < 3; i++) {
			c.m1();
		}

		void m1(){

			int k =0;
			System.out.println(k++ +" ");
		}
		
	}
}