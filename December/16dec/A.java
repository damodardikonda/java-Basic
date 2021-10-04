class A{

/*	final void m1(){

		System.out.println(" M1 - Parent method");
	}
*/

    void m1(){

    	System.out.println("m1 - Parent class");
    }
}


class B extends A{

	final void m1(){

		System.out.println(" m1 - child class");
	}

	/*
	void m1(){
	void m1(){

		System.out.println(" m1 - child class");
	}*/
}

class Test{

	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
	}
}