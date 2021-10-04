class RealEstate{

	void Booking(){

		System.out.println(" for flat");

		class BookFlat{

		       String flat = null;

		       int price;

		       BookFlat(String flat , int price){

		       	   this.flat = flat;
		       	   this.price = price;

		       	   }

		       	   void dispFlat(){

		       	   	System.out.println("Flat Location is = " + flat);
		       	   	System.out.println("Flat price is = " + price);
		       	   }
		}


		BookFlat b = new BookFlat("KP" , 10000000);
		b.dispFlat();
	}

	public static void main(String[] args) {
		
		RealEstate r = new RealEstate();
		r.Booking();
	}
}