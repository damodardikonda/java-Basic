class Devendra{
	
	int no_ghotale  = 14;

	void virodiPaksh(){

	System.out.println("Nustiii Badbad badbad badbad");
	}
}



class Chandrakant extends Devendra{
	
	int no_ghotale  = 20;

	void virodiPaksh(){

	System.out.println("Nustiii Aropppp..............");
	}
   

   void display(){


     super.virodiPaksh();
     virodiPaksh();

     System.out.println("devendra ghotale" + super.no_ghotale );

     System.out.println("Chandrakant Patil " + no_ghotale );

   }



}



class BJP{

	public static void main(String[] args) {
		
		Chandrakant champa = new Chandrakant();
		champa.display();
	}
}