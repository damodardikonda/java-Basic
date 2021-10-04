class Wc{

	Wc(){

		System.out.println(" Zero Argument Cobnstructoe");
	}


	Wc(int var1){

	
		System.out.println(" One Argument Cobnstructoe");
	}

   
	Wc( int var1 , int var2){

        this();
        this(var1);
        System.out.println(" 2 ard");
		System.out.println(" Zero Argument Cobnstructoe");
	}

	public static void main(String[] args) {
		
		Wc w = new Wc(10 ,20);
	}
}