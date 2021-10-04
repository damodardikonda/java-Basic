class Office{

	void shipoy(){

		System.out.println("Order Ghenyasathi yetoy");
	}

	void shipoy(String Specific){

		System.out.println(Specific + " Food");
	}

	 public static void main(String[] args) {
	 	
	 	Office o = new Office();
	 	o.shipoy();

	 	o.shipoy("Pohe");
	 	o.shipoy("Chai");
	 }
}