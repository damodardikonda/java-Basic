class PP{

	PP(){

		System.out.println(" Parent class Using Super() methid");
	}

}

class CC extends PP{

	CC(){

		super();

		System.out.println(" Child class Constructor");
	}


	public static void main(String[] args) {
		
		CC c = new CC();
	
	}
}