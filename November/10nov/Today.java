class TripPlan{

    TripPlan(){

    	System.out.println("Goa");
    }
	void place(){

		System.out.println(" Goa wale beechpein");
	}

}

class Today{

	public static void main(String[] args) {
		
		TripPlan tp = new TripPlan(){

			void place(){

				System.out.println("Alibaug");
			}
		};
 
		tp.place();

	}
}