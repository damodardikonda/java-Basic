class Demo3{

	void m1( int x ){

        System.out.println(" Integer value");
	}

	void m1( float ff){

		System.out.println(" Float value");
	}


	public static void main(String[] args) {
		
		Demo3 d = new Demo3();
		d.m1('A');
		d.m1(10);
		d.m1(50l);
		d.m1(58.34f);
		//d.m1(57.86); error
	}
}