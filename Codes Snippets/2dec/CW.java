class CW{

	CW(){

		System.out.println(" Default Constructor");
	}

	CW( int var1){

		this();
		System.out.println(" one argument Constructor" + var1);
	}

	public static void main(String[] args) {
		
		CW c = new CW(10);
	}
}