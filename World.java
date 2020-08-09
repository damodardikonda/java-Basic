class Quwet{
	
       Quwet(double petrol , double oil , double diesel){

	System.out.println("Petrol rate" + petrol);
	System.out.println("oil rate" + oil);
	System.out.println("diesel rate" + diesel);



	}
}


class India extends Quwet{
	

        India(double petrol , double oil , double diesel){

        	super(45.20 , 52.80, 3 5.67);

          	System.out.println("Petrol rate" + petrol);
	System.out.println("oil rate" + oil);
	System.out.println("diesel rate" + diesel);


        }
}


class World{
	
	public static void main(String args[]){


	       India raj = new India(80.20 , 93.80, 75.67);
	       
	}
}