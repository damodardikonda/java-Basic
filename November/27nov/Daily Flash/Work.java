class Mobadala{
	
	void fees(String dhanya){

	     System.out.println(" Kaamacha Mobadala ha Dhanya milal");
	}

	void fees( int rs){

		System.out.println(" Kaamacha mobadala ha Rupees milale");
	}

	void fees( float paise){

		System.out.println(" Kaamacha badlyat Paise pn milale ");
	}


}

class Work{

	public static void main(String[] args) {
		
		Mobadala m = new Mobadala();
		m.fees("Tandul");
		m.fees(1000);
		m.fees(10.50f);
	}
}