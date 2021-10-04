interface I{

	void num(int n);
}

class A implements I{

	public void num(int n ){

		int square = n*n ;
		System.out.println(square);
	}
}

class Test{

	public static void main(String[] args) {
		
		I obj = new A();
		obj.num(5);
	}
}