class Trip{
	
	public void tripLoc(){

		System.out.println(" GOA Trip");
	}

}

class TripChange{

	public static void main(String[] args) {
		
		Trip t = new Trip(){

			public void tripLoc(){

				System.out.println(" Alibaug trip");
			}
		};

		t.tripLoc();
	}
}