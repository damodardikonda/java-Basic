interface A{

	void m1();
}

interface B extends A{

	void m2();
}

class AB implements B{

	public void m1(){

		System.out.println(" M1 Method");
	}

	public void m2(){

		System.out.println(" M2 Method");
	}
}

class Test4{

	public static void main(String[] args) {
		
		AB a = new AB();
		a.m1();
		a.m2();
	}
}