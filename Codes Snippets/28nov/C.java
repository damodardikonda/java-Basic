class C{

	int var = 10;
	C( int var ) {

		this.var = var;
	}

	C (C c){

		this.var = var ;
	}

	public static void main(String[] args) {
		
		C c1 = new C(100);

		C c2 = new C(c1);

		System.out.println(c1.var);
		System.out.println(c2.var);
	}
}