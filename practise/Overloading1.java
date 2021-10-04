class Hospital{

	
		
		void getBed(){ 

			System.out.println(" Book 1 Bed for Me ");
		}

		void getBed( String name ){

			System.out.println(" Book 1 Bed for " + name  );
		}
	
}

class Patient{

	public static void main(String[] args) {
		
		Hospital h = new Hospital();
		h.getBed();
		h.getBed("Damodar");
	}
}