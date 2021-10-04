class Calculator{

     int sum =0;
     int s = 0;
	void add( int a, int b){

		sum = a + b;
		System.out.println(" Addition of 2 numbar is = " + sum);
	}

	void add( int a, int b , int c){

		s = a+b+c;
		System.out.println(" Addition of Three number is = " + s);
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.add(10 ,20);
		c.add(10 , 20 ,30 );
	}
}