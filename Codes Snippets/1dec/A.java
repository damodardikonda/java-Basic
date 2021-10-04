class A{

	int i ;
	int j;

	A(){

		i = 1;
		j = 2;
	}
}

class C{

	public static void main(String[] args) {
		
		A o1 = new A();
	

		System.out.println(o1.toString());
	}
}