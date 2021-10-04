
class Demo2{

	void m1( int x ){

		System.out.println(" int values");
	}

	void m1( char c ){

		System.out.println(" Char value");
	}


	public static void main(String[] args) {
		
		Demo2 d = new Demo2();
		d.m1(10);
		d.m1('A');
	}
}