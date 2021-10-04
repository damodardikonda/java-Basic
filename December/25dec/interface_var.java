interface A{

	int x = 10;
	void m1();
}

interface B{

	int x = 20;
	void m1();
}

class AB implements A,B{

	public void m1(){

		System.out.println(A.x);
		System.out.println(B.x);
	}
}

class Test1{

	public static void main(String[] args) {
		
		A a = new AB();
		a.m1();
	}
}