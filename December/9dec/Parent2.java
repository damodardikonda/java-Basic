class Parent2{

	int x = 10 ;
}

class Child2 extends Parent2{

    int x = 50 ;


	static void disp(){
         
        System.out.println( " X = " + super.x);
		System.out.println(" X = " + this.x );
	}


	public static void main(String[] args) {
		

         Child2 c = new Child2();
		disp();
	}
}

// we cant access this and super variable in static method