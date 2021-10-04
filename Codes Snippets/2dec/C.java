class C{
	
	int var1;

	C( int var1 ){

		this.var1 = var1;
	}

	C( int var1 , int var2 , int var3){

		var1 = var1;
		System.out.println(var1 + "");


		var1 = var2;
		System.out.println(var1 + "");


		var2 = var3;
		System.out.println(var1 + "");

		C(var1);


	}

	public static void main(String[] args) {
		
		C c = new C(100 , 200 ,300);
		System.out.println(c.var1); 	 		
	}
}